package org.example;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
public class Factura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_factura;
    private int numero;
    private float total;
    private Date fecha_factura;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fx_Cliente")
    private Cliente cliente;

    @OneToMany()
    @JoinColumn(name= "factura_id")
    @Builder.Default
    private Set<DetalleFactura> facturas = new HashSet<>();
}
