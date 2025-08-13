package homework_03.app.service;

import homework_03.app.domain.Game;

import java.io.IOException;

public interface GameService {
    Game getGame(Long id) throws IOException;
}
