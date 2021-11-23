package com.platzi.platzimarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORIAS")
public class Categorias {

    @Id
    @Column(name = "id_categorias")
    private Integer idCategoria;

    private String descripcion;

    private String estado;
    @OneToMany(mappedBy = "categorias")
    private List<Producto> productos;

}
