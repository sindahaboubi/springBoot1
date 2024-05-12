package projet1.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projet1.Entites.Inscription;
import projet1.Services.IInscription;

import java.util.List;

@AllArgsConstructor
@RestController
public class InscriptionRestController {
    private IInscription iInscription;

    @PostMapping("/addInscription")
    public Inscription addInscription(@RequestBody Inscription inscription){
        return iInscription.addInscription(inscription);
    }

    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription inscription){
        return iInscription.updateInscription(inscription);
    }

    @GetMapping("/getAllInscriptions")
    public List<Inscription> getAllInscriptions(){
        return iInscription.getAllInscriptions();
    }

    @GetMapping("/getAllInscriptions/{numInscription}") //l id ylzm ykoun nafs esm l paramètre li fl méthode
    public Inscription getInscriptionById(@PathVariable Long numInscription){ //ki tebda 3andi id en paramètre -> @PathVariable
        return iInscription.getInscriptionById(numInscription);
    }

    @DeleteMapping("/deleteInscription/{numInscription}")
    public void deleteInscription(@PathVariable Long numInscription){
        iInscription.deleteInscription(numInscription);
    }

    @PostMapping("/addInscriptionAndAssignToSkieur/{numSk}")
    public Inscription addInscriptionAndAssignToSkieur (@RequestBody Inscription inscription, @PathVariable Long numSk){
        return iInscription.addInscriptionAndAssignToSkieur(inscription, numSk);
    }

    @PostMapping("/addInscriptionAndAssignToCours/{numCours}")
    public Inscription addInscriptionAndAssignToCours(@RequestBody Inscription inscription, @PathVariable Long numCours){
        return iInscription.addInscriptionAndAssignToCours(inscription, numCours);
    }
}
