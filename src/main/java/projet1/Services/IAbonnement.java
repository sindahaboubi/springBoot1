package projet1.Services;

import projet1.Entites.Abonnement;

import java.util.List;

public interface IAbonnement {
    public Abonnement addAbonnement(Abonnement abn);
    public Abonnement updateAbonnement(Abonnement abn);
    public List<Abonnement> getAllAbonnement();
    public Abonnement getAbonnementById(Long numAbn);
    public void deleteAbonnement(Long numAbn);
}
