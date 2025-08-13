package lesson_03.app.service;

import lesson_03.app.domain.Product;
import lesson_03.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    /*
  1. @Autowired
  2. внедрение через конструктор
  3. внедрение чурез сеттер
   */

    private final ProductRepository repository;

    @Autowired
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product getById(Long id) {
       return repository.getById(id);
    }
}
