package pe.edu.upc.careeradversory.alumnointerface;

import pe.edu.upc.careeradversory.entities.TestVocacionales;
import java.util.List;

public interface ITestVocacionalesService {

    void insert (TestVocacionales testVocacionales);

    List<TestVocacionales> List();

    void delete(int idTest);

    List<TestVocacionales> search (String tipoTest);

}
