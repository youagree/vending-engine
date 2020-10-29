package ru.vending.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private Integer choiceNumber;
    private String description;
    private Integer price;
    private String image;
    private Integer count;

}
