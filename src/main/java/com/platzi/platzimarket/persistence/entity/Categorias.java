package com.platzi.platzimarket.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIAS")
public class Categorias {

    @Id
    @Column(name = "id_categorias")
    private Integer idCategoria;

    private String descripcion;

    private String estado;
}
