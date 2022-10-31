package pe.edu.upc.careeradversory.alumnoimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.careeradversory.alumnointerface.IAsesorService;
import pe.edu.upc.careeradversory.entities.Alumno;
import pe.edu.upc.careeradversory.entities.Asesor;
import pe.edu.upc.careeradversory.repository.IAlumnoRepository;
import pe.edu.upc.careeradversory.repository.IAsesorRepository;

import java.util.List;
@Service
public class AsesorServiceImpl implements IAsesorService {

    @Autowired
    private IAsesorRepository aR;

    @Override
    public void insert(Asesor asesor) {aR.save(asesor);}

    @Override
    public List<Asesor> list(){ return aR.findAll();}

    @Override
    public void delete(int id) {aR.deleteById(id);}

    @Override
    public List<Asesor> search(String name){
        return aR.buscarNombre(name);}
}
