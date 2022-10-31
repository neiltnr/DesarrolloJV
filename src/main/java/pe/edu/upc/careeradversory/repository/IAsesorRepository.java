package pe.edu.upc.careeradversory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.careeradversory.entities.Alumno;
import pe.edu.upc.careeradversory.entities.Asesor;

import java.util.List;
@Repository
public interface IAsesorRepository extends JpaRepository <Asesor,Integer>{

    @Query("FROM Asesor p WHERE p.name LIKE %:name% OR LOWER(p.name)" +
            "LIKE %:name% OR p.name LIKE %:name%")

    List<Asesor> buscarNombre(@Param("name") String name);
}
