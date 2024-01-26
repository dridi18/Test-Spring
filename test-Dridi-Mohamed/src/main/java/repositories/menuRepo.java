package repositories;

import entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface menuRepo extends JpaRepository<Menu,Long> {
}
