package homework_03.app.service;

import homework_03.app.domain.Game;
import homework_03.app.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GameServiceImpl implements GameService {
    private final GameRepository repository;

    @Autowired
    public GameServiceImpl(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public Game getGame(Long id) throws IOException {
        return repository.findById(id);
    }
}
