package ru.vending.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    // TODO Удалить или превратить в класс для маппинга

    @Id
    @Column (name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    @ToString.Exclude
    private Category category_id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int price;

    @Column
    private String image;

    @Column
    private int count;

}
