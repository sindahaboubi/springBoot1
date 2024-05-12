package projet1.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projet1.Entites.Abonnement;
import projet1.Entites.Skieur;
import projet1.Repositories.AbonnementRepository;
import projet1.Repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AbonnementServiceImpl implements IAbonnement {
    private AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement(Abonnement  abn) {
        return abonnementRepository.save(abn);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abn) {
        return abonnementRepository.save(abn);
    }

    @Override
    public List<Abonnement> getAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement getAbonnementById(Long numAbn) {
        return abonnementRepository.findById(numAbn).orElse(null);
    }

    @Override
    public void deleteAbonnement(Long numAbn) {
        abonnementRepository.deleteById(numAbn);
    }
}
