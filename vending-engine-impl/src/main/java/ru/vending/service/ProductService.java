package ru.vending.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cash.control.client.CashControlClientInterface;
import ru.vending.api.ComportInterfaceIntegration;
import ru.vending.dto.ProductDto;
import ru.vending.entity.Product;
import ru.vending.mapper.ProductMapper;
import ru.vending.repository.ProductRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class ProductService {

    private ProductMapper productMapper;
    private ProductRepository productRepository;
    private ComportInterfaceIntegration comportInterfaceIntegration;
    private CashControlClientInterface cashControlClientInterface;

    @Autowired
    public ProductService(ProductMapper productMapper,
                          ProductRepository productRepository,
                          ComportInterfaceIntegration comportInterfaceIntegration,
                          CashControlClientInterface cashControlClientInterface) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
        this.comportInterfaceIntegration = comportInterfaceIntegration;
        this.cashControlClientInterface = cashControlClientInterface;
    }

    @Transactional(readOnly = true)
    public ProductDto getProductById(Long id) {
        log.info("Try found product by id, this ID - {}", id);
        Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        log.info("Founded product: {}", product);
        return productMapper.mapToDto(product);
    }

    @Transactional(readOnly = true)
    public ProductDto getProductByCN(Long id) {
        log.info("Try found product by id, this ID - {}", id);
        Product product = productRepository.findByChoiceNumber(id.intValue()).orElseThrow(EntityNotFoundException::new);
        log.info("Founded product: {}", product);
        return productMapper.mapToDto(product);
    }

    @Transactional(readOnly = true)
    public List<ProductDto> getAllProducts () {
        List <Product> productsList = productRepository.findAll();
        log.info("Founded products: {}", productsList);
        return  productsList.stream()
                .filter(p -> p.getCount() != 0)
                .map(p -> productMapper.mapToDto(p))
                .collect(Collectors.toList());
    }

    @SneakyThrows
    @Transactional(readOnly = true)
    @Async
    public void sendIdAndPaymentType (Long id, String paymentType) {
        Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (product.getCount() == 0) {
            log.info("Sorry! This product is out of stock");
            throw new Exception("Count is 0");
        } else {
            cashControlClientInterface.startBuying(product.getPrice());
            log.info("Price and payment type sended in comport: price {}, payment type {}", product.getPrice(), paymentType);
        }
    }

}
