package ru.vending.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vending.dto.CategoryDTO;
import ru.vending.entity.Category;
import ru.vending.mapper.CategoryMapper;
import ru.vending.repository.CategoriesRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriesService {

    private final CategoriesRepository categoriesRepository;
    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoriesService(CategoriesRepository categoriesRepository, CategoryMapper categoryMapper) {
        this.categoriesRepository = categoriesRepository;
        this.categoryMapper = categoryMapper;
    }

    public List<CategoryDTO> getCategories() {
        List<Category> categories = categoriesRepository.findAll();
        return categories.stream().
                map(categoryMapper::map).
                collect(Collectors.toList());
    }


}
