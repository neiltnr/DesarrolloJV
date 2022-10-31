package pe.edu.upc.careeradversory.alumnointerface;


import pe.edu.upc.careeradversory.entities.Asesor;

import java.util.List;

public interface IAsesorService {

    void insert (Asesor asesor);

    List<Asesor> list();

    void delete(int id);

    List<Asesor> search(String id);
}
