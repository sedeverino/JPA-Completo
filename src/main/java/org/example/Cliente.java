package org.example;

import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Audited
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_cliente;
    private int dni;
    private String nombre;
    private String apellido;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}
