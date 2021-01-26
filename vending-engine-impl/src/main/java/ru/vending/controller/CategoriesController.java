package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vending.dto.CategoryDto;
import ru.vending.service.CategoriesService;
import ru.vending.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping(path = "ui/vending/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;
    private PaymentService paymentService;

    @Autowired
    public CategoriesController(CategoriesService categoriesService, PaymentService paymentService) {
        this.categoriesService = categoriesService;
        this.paymentService = paymentService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        paymentService.reset();
        return ResponseEntity.ok(categoriesService.getCategories());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<CategoryDto> getCategory(@PathVariable Long id) {
        return ResponseEntity.ok(categoriesService.getCategoryById(id));
    }
}
