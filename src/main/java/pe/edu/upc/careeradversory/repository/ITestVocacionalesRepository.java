package pe.edu.upc.careeradversory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.careeradversory.entities.TestVocacionales;

import java.util.List;

@Repository
public interface ITestVocacionalesRepository extends JpaRepository<TestVocacionales, Integer> {

    @Query("FROM TestVocacionales p WHERE p.tipoTest LIKE %:tipoTest% OR LOWER(p.tipoTest)" +
            "LIKE %:tipoTest% OR p.tipoTest LIKE %:tipoTest%")
    List<TestVocacionales> buscarTipo(@Param("tipoTest") String tipoTest);
}
