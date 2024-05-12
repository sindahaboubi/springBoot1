package projet1.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inscription implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numInscription;
    private int numSemaine;
    @ManyToOne
    @JsonIgnore //C'est pour ne pas retourner une boucle infinie
    private Skieur skieur;
    @ManyToOne
    private Cours cours;
}
