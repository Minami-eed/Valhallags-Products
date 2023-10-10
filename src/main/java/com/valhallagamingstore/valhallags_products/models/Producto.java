package com.valhallagamingstore.valhallags_products.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_Product;

    @Column(name = "nombre_producto")
    private String name_product;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_juego")
    private int id_game;
}
