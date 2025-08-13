package homework_03.client;

import homework_03.app.controller.GameController;
import homework_03.app.domain.Game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("homework_03.app");
        GameController controller = context.getBean(GameController.class);
        Game game = controller.getById(1L);
        System.out.println(game);
    }
}
