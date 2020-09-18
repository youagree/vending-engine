package ru.vending.dto;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private int price;
    private String image;
    private int count;

}
