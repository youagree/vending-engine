package ru.vending.mapper;

import org.mapstruct.Mapper;
import ru.vending.dto.CategoryDTO;
import ru.vending.entity.Category;

@Mapper
public interface CategoryMapper {

    CategoryDTO map(Category category);

}
