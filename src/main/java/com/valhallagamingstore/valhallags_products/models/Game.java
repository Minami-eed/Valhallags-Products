package com.valhallagamingstore.valhallags_products.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_juegos")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_juego")
    private int id_game;

    @Column(name = "nombre_juego")
    private String nombre_game;

    @Column(name = "descripcion_juego")
    private String descripcion_game;

    @Column(name = "imagen")
    private String image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_recarga")
    private int id_type_recharge;
}
