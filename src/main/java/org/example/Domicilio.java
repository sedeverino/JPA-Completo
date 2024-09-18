package org.example;

import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Audited
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_domicilio;
    private String calle;
    private int numeracion;
}
