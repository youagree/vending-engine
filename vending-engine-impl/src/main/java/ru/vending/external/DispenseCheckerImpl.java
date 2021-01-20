
package ru.vending.external;

import org.springframework.beans.factory.annotation.Autowired;
import ru.cash.control.client.CanDispenseChecker;
import ru.vending.repository.ProductRepository;

import java.util.stream.Collectors;

public class DispenseCheckerImpl implements CanDispenseChecker<Integer> {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Integer getMaxPriceFromProductMatrix() {
        return productRepository.findAll().stream()
                        .map(e -> e.getPrice())
                        .collect(Collectors.summarizingInt(Integer::intValue))
                        .getMax();
    }
}