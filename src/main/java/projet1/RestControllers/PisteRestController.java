package projet1.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import projet1.Entites.Piste;
import projet1.Services.IPiste;

import java.util.List;

@AllArgsConstructor
@RestController
public class PisteRestController {
    private IPiste iPiste;

    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste){
        return iPiste.addPiste(piste);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste){
        return iPiste.updatePiste(piste);
    }

    @GetMapping("/getAllPistes")
    public List<Piste> getAllPistes(){
        return iPiste.getAllPistes();
    }

    @GetMapping("/getAllPiste/{numPiste}") //l id ylzm ykoun nafs esm l paramètre li fl méthode
    public Piste getPisteById(@PathVariable Long numPiste){ //ki tebda 3andi id en paramètre -> @PathVariable
        return iPiste.getPisteById(numPiste);
    }

    @DeleteMapping("/deletePiste/{numPiste}")
    public void deletePiste(@PathVariable Long numPiste){
        iPiste.deletePiste(numPiste);
    }
}
