package repositories;

import entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepo extends JpaRepository<Client,Long> {
}
