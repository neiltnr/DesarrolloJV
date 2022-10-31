package pe.edu.upc.careeradversory.entities;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Entity
@Table(name="asesor")
@Data
@NoArgsConstructor
public class Asesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String gender;
    private Long fecha_nacimiento;

    public Asesor(String name, String gender, Long fecha_nacimiento) {
        this.name = name;
        this.gender = gender;
        this.fecha_nacimiento = fecha_nacimiento;
    }

}
