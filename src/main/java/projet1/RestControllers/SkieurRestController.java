package projet1.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projet1.Entites.Skieur;
import projet1.Services.ISkieur;

import java.util.List;

@AllArgsConstructor
@RestController
public class SkieurRestController {
    private ISkieur iSkieur;

    @PostMapping("/addSk")
    public Skieur addSk(@RequestBody Skieur sk){
        return iSkieur.addSkieur(sk);
    }

    @PutMapping("/updateSk")
    public Skieur updateSk(@RequestBody Skieur sk){
        return iSkieur.updateSkieur(sk);
    }

    @GetMapping("/getAllSk")
    public List<Skieur> getAllSk(){
        return iSkieur.getAllSkieur();
    }

    @GetMapping("/getAllSk/{numSk}") //l id ylzm ykoun nafs esm l paramètre li fl méthode
    public Skieur getSkieurById(@PathVariable Long numSk){ //ki tebda 3andi id en paramètre -> @PathVariable
        return iSkieur.getSkById(numSk);
    }

    @DeleteMapping("/deleteSk/{numSk}")
    public void deleteSk(@PathVariable Long numSk){
        iSkieur.deleteSkieur(numSk);
    }

    @GetMapping("/getSkByNom/{nom}")
    public Skieur getSkByNom(@PathVariable String nom){
        return iSkieur.getSkByNom(nom);
    }

}
