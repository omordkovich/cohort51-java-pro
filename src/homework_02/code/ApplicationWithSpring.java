package homework_02.code;

import homework_02.staff.leads.Producer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationWithSpring {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("homework_02.config");
        Producer producer = context.getBean(Producer.class);

        producer.gameProduction();
    }
}
