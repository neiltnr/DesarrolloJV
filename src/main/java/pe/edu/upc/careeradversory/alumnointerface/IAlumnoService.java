package pe.edu.upc.careeradversory.alumnointerface;

import pe.edu.upc.careeradversory.entities.Alumno;

import java.util.List;

public interface IAlumnoService {
    void insert (Alumno alumno);

    List<Alumno> list();

    void delete(int idAlumno);

    List<Alumno> search(String nameAlumno);
}
