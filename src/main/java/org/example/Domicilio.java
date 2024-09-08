package org.example;

import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_domicilio;
    private String calle;
    private int numeracion;
}
