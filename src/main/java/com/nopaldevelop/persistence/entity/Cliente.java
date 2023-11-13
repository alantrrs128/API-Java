package com.nopaldevelop.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "id")
    private String idCliente;

    @Column(name = "nombre")
    private String nombre;

    private String apellidos;

    private Long celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String email;
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}