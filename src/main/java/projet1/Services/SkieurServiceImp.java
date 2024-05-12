package projet1.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projet1.Entites.Skieur;
import projet1.Repositories.SkieurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SkieurServiceImp implements ISkieur {
    private SkieurRepository skieurRepository;
    @Override
    public Skieur addSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public Skieur updateSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public List<Skieur> getAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur getSkById(Long numsk) {
        return skieurRepository.findById(numsk).orElse(null);
    }

    @Override
    public void deleteSkieur(Long numsk) {
        skieurRepository.deleteById(numsk);
    }

    @Override
    public Skieur getSkByNom(String nom) {
        return skieurRepository.findByNomS(nom);
    }
}
