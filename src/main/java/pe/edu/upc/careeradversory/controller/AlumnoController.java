package pe.edu.upc.careeradversory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.careeradversory.entities.Alumno;
import pe.edu.upc.careeradversory.alumnoimpl.AlumnoServiceImpl;

import java.util.List;
@RestController
@RequestMapping ("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoServiceImpl aService;

    @PostMapping
    public void registrar(@RequestBody Alumno a) { aService.insert(a);}

    @GetMapping
    public List<Alumno> Listar(){
        return aService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        aService.delete(id);}

    @PutMapping
    public void actualizar(@RequestBody Alumno a){ aService.insert(a);}

    @PostMapping("/buscar")
    public List<Alumno> buscar(@RequestBody Alumno a) {return  aService.search(a.getNameAlumno());}


}
