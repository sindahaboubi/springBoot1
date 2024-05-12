package projet1.Entites;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Skieur implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaissance;
    private String ville;
    @OneToOne
    private Abonnement abonnement;
    @OneToMany (mappedBy = "skieur")
    private Set<Inscription> inscriptions;
    @ManyToMany
    private Set<Piste> pistes;
}
