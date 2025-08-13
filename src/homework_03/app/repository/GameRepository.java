package homework_03.app.repository;

import homework_03.app.domain.Game;

import java.io.IOException;

public interface GameRepository {
    Game findById(Long id) throws IOException;
}
