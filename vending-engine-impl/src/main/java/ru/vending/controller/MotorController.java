package ru.vending.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.vending.dto.MotorStatusResponse;
import ru.vending.service.MotorsService;
import ru.vending.service.ProductService;

@RestController
@RequestMapping(path = "ui/vending/motors")
public class MotorController {

    private MotorsService motorsService;
    private ProductService productService;

    @Autowired
    public MotorController(MotorsService motorsService, ProductService productService) {
        this.motorsService = motorsService;
        this.productService = productService;
    }

    @SneakyThrows
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MotorStatusResponse initMotorsForProductById(@PathVariable Long id) {
        return new MotorStatusResponse().setMotorStatus("s");
    }
}
