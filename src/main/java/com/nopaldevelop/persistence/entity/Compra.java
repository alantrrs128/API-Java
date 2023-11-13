package com.nopaldevelop.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_cliente")
    private String idCliente;
    private LocalDateTime fecha;
    @Column(name = "medio_paso")
    private String medioPago;
    private String comentarios;
    private String estatus;
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> productos;
}
