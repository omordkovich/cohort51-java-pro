package lesson_03.app.controller;

import lesson_03.app.domain.Product;
import lesson_03.app.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    public Product getById(Long id){
        return service.getById(id);
    }
}
