package projet1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projet1.Entites.Piste;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
