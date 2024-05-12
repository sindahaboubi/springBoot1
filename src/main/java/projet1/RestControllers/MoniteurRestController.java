package projet1.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projet1.Entites.Moniteur;
import projet1.Services.IMoniteur;

import java.util.List;

@AllArgsConstructor
@RestController
public class MoniteurRestController {
    private IMoniteur iMoniteur;


    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){
        return iMoniteur.addMoniteur(moniteur);
    }

    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur){
        return iMoniteur.updateMoniteur(moniteur);
    }

    @GetMapping("/getAllMoniteurs")
    public List<Moniteur> getAllMoniteurs(){
        return iMoniteur.getAllMoniteurs();
    }

    @GetMapping("/getAllMoniteur/{numMoniteur}") //l id ylzm ykoun nafs esm l paramètre li fl méthode
    public Moniteur getMoniteurById(@PathVariable Long numMoniteur){ //ki tebda 3andi id en paramètre -> @PathVariable
        return iMoniteur.getMoniteurById(numMoniteur);
    }

    @DeleteMapping("/deleteMoniteur/{numMoniteur}")
    public void deleteMoniteur(@PathVariable Long numMoniteur){
        iMoniteur.deleteMoniteur(numMoniteur);
    }

}
