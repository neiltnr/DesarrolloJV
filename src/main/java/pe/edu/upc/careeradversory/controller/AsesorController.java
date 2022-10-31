package pe.edu.upc.careeradversory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.careeradversory.alumnoimpl.AsesorServiceImpl;
import pe.edu.upc.careeradversory.entities.Asesor;


import java.util.List;
@RestController
@RequestMapping ("/asesores")
public class AsesorController {

    @Autowired
    private AsesorServiceImpl asService;

    @PostMapping
    public void registrar(@RequestBody Asesor a) { asService.insert(a);}

    @GetMapping
    public List<Asesor> Listar(){
        return asService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        asService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Asesor a){ asService.insert(a);}

    @PostMapping("/buscar")
    public List<Asesor> buscar(@RequestBody Asesor a) {return  asService.search(a.getName());}
}
