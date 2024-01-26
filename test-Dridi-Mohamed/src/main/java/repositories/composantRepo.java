package repositories;

import entities.Composant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface composantRepo extends JpaRepository<Composant,Long> {
}
