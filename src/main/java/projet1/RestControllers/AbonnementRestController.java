package projet1.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projet1.Entites.Abonnement;
import projet1.Services.IAbonnement;

import java.util.List;

@AllArgsConstructor
@RestController
public class AbonnementRestController {
    private IAbonnement iAbonnement;

    @PostMapping("/addAbn")
    public Abonnement addAbn(@RequestBody Abonnement abn){
        return iAbonnement.addAbonnement(abn);
    }

    @PutMapping("/updateAbn")
    public Abonnement updateAbn(@RequestBody Abonnement abn){
        return iAbonnement.updateAbonnement(abn);
    }

    @GetMapping("/getAllAbn")
    public List<Abonnement> getAllAbn(){
        return iAbonnement.getAllAbonnement();
    }

    @GetMapping("/getAllAbn/{numAbn}") //l id ylzm ykoun nafs esm l paramètre li fl méthode
    public Abonnement getAbonnementById(@PathVariable Long numAbn){ //ki tebda 3andi id en paramètre -> @PathVariable
        return iAbonnement.getAbonnementById(numAbn);
    }

    @DeleteMapping("/deleteAbn/{numAbn}")
    public void deleteAbn(@PathVariable Long numAbn){
        iAbonnement.deleteAbonnement(numAbn);
    }
}
