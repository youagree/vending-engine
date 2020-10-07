package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vending.service.AuthService;
import ru.vending.dto.AuthDtoWrapper;
import ru.vending.dto.CategoryDto;
import ru.vending.service.CategoriesService;

import java.util.List;

@RestController
@RequestMapping(path = "ui/vending/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;
    private final AuthService authService;

    @Autowired
    public CategoriesController(CategoriesService categoriesService, AuthService authService) {
        this.categoriesService = categoriesService;
        this.authService = authService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        // TODO получать все категории из текущей матрицы продуктов
        return ResponseEntity.ok(categoriesService.getCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable Long id) {
        // TODO Получать определенную категорию из списка категорий по идентификатору
        return ResponseEntity.ok(categoriesService.getCategoryById(id));
    }

    @GetMapping("/test")
    public ResponseEntity<AuthDtoWrapper> getAuthDto() {
        // TODO Перенести в модуль работы с Kit-Box или создать отдельный контроллер для запросов
        return ResponseEntity.ok(authService.getAuthDto());
    }

}
