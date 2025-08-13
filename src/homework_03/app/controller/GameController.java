package homework_03.app.controller;

import homework_03.app.domain.Game;
import homework_03.app.service.GameService;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GameController {
    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    public Game getById(Long id) throws IOException {
    return service.getGame(id);
    }
}
