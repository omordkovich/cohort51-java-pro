package homework_03.app.repository;

import homework_03.app.domain.Game;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

@Repository
public class GameRepositoryImpl implements GameRepository {
    private final Path repositoryFile = Path.of("src/homework_03/app/repository/repository.txt");

    @Override
    public Game findById(Long id) throws IOException {
        try (BufferedReader br = Files.newBufferedReader(repositoryFile)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                Long gameId = Long.parseLong(parts[0]);
                if (gameId.equals(id)) {
                    String title = parts[1];
                    BigDecimal price = new BigDecimal(parts[2]);
                    String description = parts[3];
                    return new Game(gameId, title, price, description);
                }
            }
        }
        return null;
    }
}
