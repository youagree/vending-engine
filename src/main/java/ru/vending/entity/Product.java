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

    @Id
    @Column (name = "productId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    @ToString.Exclude
    private Category categoryId;

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
