package ru.vending.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vending.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {

}
