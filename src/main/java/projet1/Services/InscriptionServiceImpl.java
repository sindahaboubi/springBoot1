package projet1.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projet1.Entites.Cours;
import projet1.Entites.Inscription;
import projet1.Entites.Skieur;
import projet1.Repositories.CoursRepository;
import projet1.Repositories.InscriptionRepository;
import projet1.Repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImpl implements IInscription {
    private InscriptionRepository inscriptionRepository;
    private SkieurRepository skieurRepository;
    private CoursRepository coursRepository;

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription getInscriptionById(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }

    @Override
    public void deleteInscription(Long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription addInscriptionAndAssignToSkieur(Inscription inscription, Long numSk) {
        Skieur skieur = skieurRepository.findById(numSk).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription addInscriptionAndAssignToCours(Inscription inscription, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }

}
