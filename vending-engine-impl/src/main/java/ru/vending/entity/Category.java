package ru.vending.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    // TODO Удалить или превратить в класс для маппинга

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String image;

    @OneToMany(mappedBy = "category_id")
    @ToString.Exclude
    private List<Product> products;

}
