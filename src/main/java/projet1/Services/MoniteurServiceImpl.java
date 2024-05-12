package projet1.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projet1.Entites.Moniteur;
import projet1.Repositories.MoniteurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MoniteurServiceImpl implements IMoniteur {
    private MoniteurRepository moniteurRepository;

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> getAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur getMoniteurById(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }

    @Override
    public void deleteMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);
    }
}
