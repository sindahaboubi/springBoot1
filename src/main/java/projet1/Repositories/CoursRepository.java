package projet1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projet1.Entites.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
