package org.example;

import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Audited
public class Articulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_articulo;
    private int precio;
    private int cantidad;
    private String denominacion;

    @OneToMany(mappedBy = "articulo")
    @Builder.Default
    private List<DetalleFactura> detallefactura = new ArrayList<DetalleFactura>();

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(
            name = "articulo_categoria",
            joinColumns = @JoinColumn(name = "articulo_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    @Builder.Default
    private Set<Categoria> categorias = new HashSet<>();


}
