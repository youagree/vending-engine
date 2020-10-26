package ru.vending.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private Long category_Id;
    private String name;
    private String description;
    private Integer price;
    private String image;
    private Integer count;

}
