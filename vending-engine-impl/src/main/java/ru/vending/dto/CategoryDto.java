package ru.vending.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {

    private Long matrixId; //Нужно ли это? Думаю нет
    private Long id;
    private String name;
    private String image;
    private List<ProductDto> products;

}
