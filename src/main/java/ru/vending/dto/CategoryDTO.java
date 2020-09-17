package ru.vending.dto;

import lombok.Data;
import ru.vending.entity.Product;

import java.util.List;

@Data
public class CategoryDTO {

    private Long id;
    private String name;
    private String image;
    private List<Product> products;

}
