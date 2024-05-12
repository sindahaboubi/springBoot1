package projet1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projet1.Entites.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
    //c'est l'équivalent de select * from Skieur where nomS='nomS'
    public Skieur findByNomS(String nomS);
}
