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
        if (comportInterfaceIntegration.spiralMotorWaiting().equals("1")) {
            Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
            if (product.getCount() >= 1) {
                product.setCount(product.getCount() - 1);
                productRepository.save(product);
            }

            return "Покупка выполнена!";
        } else {
            log.info("Error! Try again please!");
            return "Произошла ошибка!";
        }

    }
}

