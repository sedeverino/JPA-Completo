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
public class DetalleFactura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_detalleFactura;
    private float cantidad;
    private float subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_articulo")
    private Articulo articulo;
}
