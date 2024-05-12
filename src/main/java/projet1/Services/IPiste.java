package projet1.Services;

import projet1.Entites.Piste;
import projet1.Entites.Skieur;

import java.util.List;

public interface IPiste {
    public Piste addPiste(Piste piste);
    public Piste updatePiste(Piste piste);
    public List<Piste> getAllPistes();
    public Piste getPisteById(Long numPiste);
    public void deletePiste(Long numPiste);
}
