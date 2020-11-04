package ru.vending.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    @Autowired
    public ProductService(ProductMapper productMapper,
                          ProductRepository productRepository,
                          ComportInterfaceIntegration comportInterfaceIntegration) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
        this.comportInterfaceIntegration = comportInterfaceIntegration;
    }

    @Transactional(readOnly = true)
    public ProductDto getProductById(Long id) {
        log.info("Try found product by id, this ID - {}", id);
        Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
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
    public void sendIdAndPaymentType (Long id, String paymentType) {
        Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        if (product.getCount() == 0) {
            log.info("Sorry! This product is out of stock");
            throw new Exception("Count is 0");
        } else {
            String prodPrice = String.valueOf(product.getPrice());
            comportInterfaceIntegration.kitBoxInput(prodPrice + " " + paymentType);
            log.info("Price and payment type sended in comport: price {}, payment type {}", prodPrice, paymentType);
        }
    }
}
