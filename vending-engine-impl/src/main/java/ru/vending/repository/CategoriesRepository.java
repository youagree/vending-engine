package ru.vending.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vending.entity.Category;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {
// TODO выпилить репозиторий, возможно сделать отдельный класс который будет хранить всю матрицу продуктов

}
