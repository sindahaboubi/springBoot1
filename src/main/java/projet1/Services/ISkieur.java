package projet1.Services;

import projet1.Entites.Skieur;

import java.util.List;

public interface ISkieur {
    public Skieur addSkieur(Skieur sk);
    public Skieur updateSkieur(Skieur sk);
    public List<Skieur> getAllSkieur();
    public Skieur getSkById(Long numsk);
    public void deleteSkieur(Long numsk);
    public Skieur getSkByNom(String nom);
}
