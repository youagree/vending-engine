
package ru.vending.external;

import org.springframework.beans.factory.annotation.Autowired;
import ru.cash.control.client.CanDispenseChecker;
import ru.vending.entity.Product;
import ru.vending.repository.ProductRepository;

import java.util.stream.Collectors;

public class DispenseCheckerImpl implements CanDispenseChecker<Integer> {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Integer getMinPriceFromProductMatrix() {
        return productRepository.findAll().stream()
                        .map(Product::getPrice)
                        .collect(Collectors.summarizingInt(Integer::intValue))
                        .getMin();
    }
}