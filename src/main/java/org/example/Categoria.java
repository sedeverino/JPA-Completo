package org.example;

import javax.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Audited
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_categoria;
    private String denominacion;

    @ManyToMany(mappedBy = "categorias")
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();
}
