package repositories;

import entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface restaurantRepo extends JpaRepository<Restaurant,Long> {
}
