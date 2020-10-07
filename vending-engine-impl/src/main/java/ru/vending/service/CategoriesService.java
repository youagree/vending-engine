package ru.vending.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import ru.vending.dto.CategoryDto;
import ru.vending.entity.Category;
import ru.vending.mapper.CategoryMapper;
import ru.vending.repository.CategoriesRepository;
import javax.persistence.EntityNotFoundException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class CategoriesService {

    private final CategoriesRepository categoriesRepository;
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoriesService(CategoriesRepository categoriesRepository, CategoryMapper categoryMapper) {
        this.categoriesRepository = categoriesRepository;
        this.categoryMapper = categoryMapper;
    }

    public List<CategoryDto> getCategories() {
        // TODO продумать логику выделения категорий из матрицы продуктов (Map<String,List>?)
        List<Category> categories = categoriesRepository.findAll();
        log.info("Founded categories: {}", categories);
        return categories.stream().
                map(categoryMapper::map).
                collect(Collectors.toList());
    }

    public CategoryDto getCategoryById(Long id) {
        // TODO вытаскивать категорию из всех категорий...
        Category category = categoriesRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        log.info("Founded category: {}", category.getName());
        return categoryMapper.map(category);
    }

    private static Connection connection;
    private static Statement statement;



}
