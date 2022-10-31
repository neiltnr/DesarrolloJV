package pe.edu.upc.careeradversory.alumnointerface;

import pe.edu.upc.careeradversory.entities.Preguntas;

import java.util.List;

public interface IPreguntasService {

        void insert (Preguntas preguntas);

        List<Preguntas> list();

        void delete(int idPregunta);

        List<Preguntas> search(String tituloPregunta);
}
