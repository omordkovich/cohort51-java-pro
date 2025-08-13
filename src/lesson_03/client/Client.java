package lesson_03.client;

import lesson_03.app.controller.ProductController;
import lesson_03.app.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("lesson_03.app");

        ProductController controller = context.getBean(ProductController.class);

        Product product = controller.getById(2L);

        System.out.println(product);
    }
}
