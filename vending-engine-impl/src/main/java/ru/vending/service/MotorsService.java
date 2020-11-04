package ru.vending.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vending.api.ComportInterfaceIntegration;
import ru.vending.entity.Product;
import ru.vending.repository.ProductRepository;

import javax.persistence.EntityNotFoundException;

@Slf4j
@Service
public class MotorsService {

    private ComportInterfaceIntegration comportInterfaceIntegration;
    private ProductRepository productRepository;

    @Autowired
    public MotorsService(ComportInterfaceIntegration comportInterfaceIntegration, ProductRepository productRepository) {
        this.comportInterfaceIntegration = comportInterfaceIntegration;
        this.productRepository = productRepository;
    }

    @Transactional
    public String activateMotorsByChoiceNumber(Integer choiceNumber, Long id) {
        comportInterfaceIntegration.spiralMotorInput(String.valueOf(choiceNumber));
        log.info("Send choice number of product in motors comport! Choice number: {}, ID: {}", choiceNumber, id);
        if (comportInterfaceIntegration.spiralMotorWaiting().equals("1")) {
            log.info("The response is received: \"1\". Product issued to the customer.");
            Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
            if (product.getCount() >= 1) {
                product.setCount(product.getCount() - 1);
                productRepository.save(product);
                log.info("Count of current product has been reduced");
            }
            log.info("Purchase complete!");
            return "Покупка выполнена!";
        } else {
            //todo error log
            log.info("Error! Try again please!");
            return "Произошла ошибка!";
        }

    }
}

