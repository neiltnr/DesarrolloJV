package pe.edu.upc.careeradversory.alumnoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.careeradversory.entities.Alumno;

import pe.edu.upc.careeradversory.alumnointerface.ITestVocacionalesService;
import pe.edu.upc.careeradversory.entities.TestVocacionales;
import pe.edu.upc.careeradversory.repository.ITestVocacionalesRepository;

import java.util.List;

@Service
public class TestVocacionalesImpl implements ITestVocacionalesService{

    @Autowired
    private ITestVocacionalesRepository tR;

    @Override
    public void insert(TestVocacionales testVocacionales) {tR.save(testVocacionales);}

    @Override
    public List<TestVocacionales> List() {return tR.findAll();}

    @Override
    public void delete(int idTest) {tR.deleteById(idTest);}

    @Override
    public List<TestVocacionales> search(String tipoTest){
        return tR.buscarTipo(tipoTest);
    }
}
