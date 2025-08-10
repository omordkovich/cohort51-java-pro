package lesson_02.classwork_02.app.code;


import lesson_02.classwork_02.app.staff.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationWithSpring {
    public static void main(String[] args) {
       //Получаем контекст приложения (хранилище бинов)
        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext("lesson_02.classwork_02.app.config");

     //Из контекста получаем Bean
        Director director = context.getBean(Director.class);
    director.manageCompany();
    }
}
