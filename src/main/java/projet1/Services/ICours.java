package projet1.Services;

import projet1.Entites.Cours;

import java.util.List;

public interface ICours {
    public Cours addCours(Cours cours);
    public Cours updateCours(Cours cours);
    public List<Cours> getAllCours();
    public Cours getCoursById(Long numCours);
    public void deleteCours(Long numCours);
}
