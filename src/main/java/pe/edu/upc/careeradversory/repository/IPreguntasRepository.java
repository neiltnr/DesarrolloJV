package pe.edu.upc.careeradversory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.careeradversory.entities.Preguntas;


import java.util.List;

@Repository
public interface IPreguntasRepository extends JpaRepository <Preguntas,Integer> {

    @Query("FROM Preguntas p WHERE p.tituloPregunta LIKE %:tituloPregunta% OR LOWER(p.tituloPregunta)" +
            "LIKE %:tituloPregunta% OR p.tituloPregunta LIKE %:tituloPregunta%")

    List<Preguntas> buscarNombre(@Param("tituloPregunta") String tituloPregunta);

}
