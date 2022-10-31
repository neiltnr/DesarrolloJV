package pe.edu.upc.careeradversory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.careeradversory.entities.Alumno;

import java.util.List;
@Repository
public interface IAlumnoRepository extends JpaRepository <Alumno, Integer> {

    @Query("FROM Alumno p WHERE p.nameAlumno LIKE %:nameAlumno% OR LOWER(p.nameAlumno)" +
            "LIKE %:nameAlumno% OR p.nameAlumno LIKE %:nameAlumno%")

    List<Alumno> buscarNombre(@Param("nameAlumno") String nameAlumno);
}
