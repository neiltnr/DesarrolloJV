package pe.edu.upc.careeradversory.alumnoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.careeradversory.alumnointerface.IPreguntasService;
import pe.edu.upc.careeradversory.entities.Alumno;
import pe.edu.upc.careeradversory.entities.Preguntas;
import pe.edu.upc.careeradversory.repository.IAlumnoRepository;
import pe.edu.upc.careeradversory.repository.IPreguntasRepository;
import java.util.List;
@Service
public class PreguntasServiceImpl implements IPreguntasService {

    @Autowired
    private IPreguntasRepository pR;

    @Override
    public void insert(Preguntas preguntas) {pR.save(preguntas);}

    @Override
    public List<Preguntas> list(){ return pR.findAll();}

    @Override
    public void delete(int idAlumno) {pR.deleteById(idAlumno);}

    @Override
    public List<Preguntas> search(String nameAlumno){
        return pR.buscarNombre(nameAlumno);}
}
