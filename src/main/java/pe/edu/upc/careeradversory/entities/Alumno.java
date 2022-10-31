package pe.edu.upc.careeradversory.entities;

import javax.persistence.*;

@Entity
@Table (name = "Alumno")

public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAlumno;

        @Column (name = "nameAlumno", length = 40, nullable = false)
        private String nameAlumno;

        @Column (name = "emailAlumno", length = 35, nullable = false)
        private String emailAlumno;

        @Column(name = "edadAlumno", length = 2, nullable = false)
        private int edadAlumno;

        @Column (name = "numAlumno", length = 9, nullable = false)
        private int numAlumno;

    public Alumno(){}

        public Alumno(int idAlumno, String nameAlumno, String emailAlumno, int edadAlumno, int numAlumno) {
        this.idAlumno = idAlumno;
        this.nameAlumno = nameAlumno;
        this.emailAlumno = emailAlumno;
        this.edadAlumno = edadAlumno;
        this.numAlumno = numAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNameAlumno() {
        return nameAlumno;
    }

    public void setNameAlumno(String nameAlumno) {
        this.nameAlumno = nameAlumno;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public int getEdadAlumno() {
        return edadAlumno;
    }

    public void setEdadAlumno(int edadAlumno) {
        this.edadAlumno = edadAlumno;
    }

    public int getNumAlumno() {
        return numAlumno;
    }

    public void setNumAlumno(int numAlumno) {
        this.numAlumno = numAlumno;
    }
}
