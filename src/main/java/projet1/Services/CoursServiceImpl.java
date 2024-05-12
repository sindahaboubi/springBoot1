package projet1.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projet1.Entites.Cours;
import projet1.Repositories.CoursRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CoursServiceImpl implements ICours {
    private CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public Cours getCoursById(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public void deleteCours(Long numCours) {
        coursRepository.deleteById(numCours);
    }
}
