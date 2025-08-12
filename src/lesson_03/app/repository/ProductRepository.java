package lesson_03.app.repository;

import lesson_03.app.domain.Product;

public interface ProductRepository {
    Product getById(Long id);


}
