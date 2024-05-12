package projet1.Services;

import projet1.Entites.Inscription;

import java.util.List;

public interface IInscription {
    public Inscription addInscription(Inscription inscription);
    public Inscription updateInscription(Inscription inscription);
    public List<Inscription> getAllInscriptions();
    public Inscription getInscriptionById(Long numInscription);
    public void deleteInscription(Long numInscription);
    public  Inscription addInscriptionAndAssignToSkieur(Inscription inscription, Long numSk);
    public Inscription addInscriptionAndAssignToCours(Inscription inscription, Long numCours);
}
