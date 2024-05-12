package projet1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projet1.Entites.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
