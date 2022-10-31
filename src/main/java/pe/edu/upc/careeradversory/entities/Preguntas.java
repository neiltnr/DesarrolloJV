package pe.edu.upc.careeradversory.entities;

import javax.persistence.*;

@Entity
@Table (name= "Preguntas")
public class Preguntas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPregunta;

        @Column (name = "tituloPregunta", length = 50, nullable = false)
        private String tituloPregunta;

        @Column (name = "descripcion", length = 255, nullable = false)
        private String descripcion;

        public Preguntas(){}

    public Preguntas(int idPregunta, String tituloPregunta, String descripcion) {
        this.idPregunta = idPregunta;
        this.tituloPregunta = tituloPregunta;
        this.descripcion = descripcion;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getTituloPregunta() {
        return tituloPregunta;
    }

    public void setTituloPregunta(String tituloPregunta) {
        this.tituloPregunta = tituloPregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
