package com.valhallagamingstore.valhallags_products.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_tipo_recarga")
public class TypeRecharge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_recarga")
    private int id_type_recharge;

    @Column(name = "nombre_tipo_recarga")
    private String name_type_recharge;

    @Column(name = "descripcion_tipo_recarga")
    private String description_type_recharge;
}
