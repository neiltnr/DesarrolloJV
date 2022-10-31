package pe.edu.upc.careeradversory.alumnoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.careeradversory.entities.Alumno;
import pe.edu.upc.careeradversory.repository.IAlumnoRepository;
import pe.edu.upc.careeradversory.alumnointerface.IAlumnoService;

import java.util.List;
@Service
public class AlumnoServiceImpl implements IAlumnoService {

    @Autowired
    private IAlumnoRepository aR;

    @Override
    public void insert(Alumno alumno) {aR.save(alumno);}

    @Override
    public List<Alumno> list(){ return aR.findAll();}

    @Override
    public void delete(int idAlumno) {aR.deleteById(idAlumno);}

    @Override
    public List<Alumno> search(String nameAlumno){
        return aR.buscarNombre(nameAlumno);}
}
