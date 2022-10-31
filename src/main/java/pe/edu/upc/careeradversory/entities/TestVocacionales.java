package pe.edu.upc.careeradversory.entities;

import javax.persistence.*;


@Entity
@Table (name = "TestVocacionales")
public class TestVocacionales {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idTest;

        @Column (name = "duracionTest", length = 20, nullable = false)
        private int duracionTest;

        @Column (name = "tipoTest", length = 30, nullable = false)
        private String tipoTest;

    public TestVocacionales(){}

    public TestVocacionales(int idTest, int duracionTest, String tipoTest) {
        this.idTest = idTest;
        this.duracionTest = duracionTest;
        this.tipoTest = tipoTest;
    }

    public int getIdTest() {
        return idTest;
    }

    public void setIdTest(int idTest) {
        this.idTest = idTest;
    }

    public int getDuracionTest() {
        return duracionTest;
    }

    public void setDuracionTest(int duracionTest) {
        this.duracionTest = duracionTest;
    }

    public String getTipoTest() {
        return tipoTest;
    }

    public void setTipoTest(String tipoTest) {
        this.tipoTest = tipoTest;
    }
}
