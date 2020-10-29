package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping ("/{id}")
    public String lestFuckingBuyThisShit (@PathVariable Long id) {
        motorsService.activateMotorsByChoiceNumber(productService.getProductById(id).getChoiceNumber(), id);
        return "Заебись";
    }
}
