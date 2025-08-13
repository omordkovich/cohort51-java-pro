package homework_03.app.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Game {
    private Long id;
    private String title;
    private BigDecimal price;
    private String description;

    public Game(Long id, String title, BigDecimal price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Game game)) return false;
        return Objects.equals(id, game.id) && Objects.equals(title, game.title) && Objects.equals(price, game.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
