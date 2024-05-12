package projet1.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projet1.Entites.Cours;
import projet1.Entites.Skieur;
import projet1.Services.ICours;

import java.util.List;

@AllArgsConstructor
@RestController
public class CoursRestController {
    private ICours iCours;

    @PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours cours){
        return iCours.addCours(cours);
    }

    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours){
        return iCours.updateCours(cours);
    }

    @GetMapping("/getAllCours")
    public List<Cours> getAllCours(){
        return iCours.getAllCours();
    }

    @GetMapping("/getAllCours/{numCours}") //l id ylzm ykoun nafs esm l paramètre li fl méthode
    public Cours getCoursById(@PathVariable Long numCours){ //ki tebda 3andi id en paramètre -> @PathVariable
        return iCours.getCoursById(numCours);
    }

    @DeleteMapping("/deleteCours/{numCours}")
    public void deleteCours(@PathVariable Long numCours){
        iCours.deleteCours(numCours);
    }
}
