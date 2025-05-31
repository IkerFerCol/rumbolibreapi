package com.iker.rumbolibreapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "RESERVA")
public class reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "VUELOID")
    private Long vueloId;

    @Column(name = "USUARIONOMBRE")
    private String usuarioNombre;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getVueloId() { return vueloId; }
    public void setVueloId(Long vueloId) { this.vueloId = vueloId; }

    public String getUsuarioNombre() { return usuarioNombre; }
    public void setUsuarioNombre(String usuarioNombre) { this.usuarioNombre = usuarioNombre; }
}
