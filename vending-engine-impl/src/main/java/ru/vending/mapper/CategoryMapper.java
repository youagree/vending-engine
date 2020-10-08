package ru.vending.mapper;

import org.mapstruct.Mapper;
import ru.vending.dto.CategoryDto;
import ru.vending.entity.Category;

@Mapper(uses = ProductMapper.class)
public interface CategoryMapper {

    CategoryDto map(Category category);
    // TODO подготовить класс под форму продукта из сервиса
}