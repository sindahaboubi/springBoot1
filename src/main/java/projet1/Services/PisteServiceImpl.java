package projet1.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projet1.Entites.Piste;
import projet1.Repositories.PisteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPiste {
    private PisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste getPisteById(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }
}
