package ru.vending.mapper;

import org.mapstruct.Mapper;
import ru.vending.dto.ProductDto;
import ru.vending.entity.Product;

@Mapper
public interface ProductMapper {

    ProductDto mapToDto(Product product);
}