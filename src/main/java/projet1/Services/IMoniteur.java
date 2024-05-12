package projet1.Services;

import projet1.Entites.Abonnement;
import projet1.Entites.Moniteur;

import java.util.List;

public interface IMoniteur {
    public Moniteur addMoniteur(Moniteur moniteur);
    public Moniteur updateMoniteur(Moniteur moniteur);
    public List<Moniteur> getAllMoniteurs();
    public Moniteur getMoniteurById(Long numMoniteur);
    public void deleteMoniteur(Long numMoniteur);
}
