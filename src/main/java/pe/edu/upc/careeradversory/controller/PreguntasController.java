package pe.edu.upc.careeradversory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.careeradversory.alumnoimpl.PreguntasServiceImpl;
import pe.edu.upc.careeradversory.entities.Alumno;
import pe.edu.upc.careeradversory.entities.Preguntas;

import java.util.List;
@RestController
@RequestMapping ("/preguntas")
public class PreguntasController {

    @Autowired
    private PreguntasServiceImpl pService;

    @PostMapping
    public void registrar (@RequestBody Preguntas p) {pService.insert(p);}

    @GetMapping
    public List<Preguntas> Listar(){
        return pService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        pService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Preguntas a){ pService.insert(a);}

    @PostMapping("/buscar")
    public List<Preguntas> buscar(@RequestBody Preguntas a) {return  pService.search(a.getTituloPregunta());}
}
