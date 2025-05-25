package com.iker.rumbolibreapi.model;

import jakarta.persistence.*;

@Entity
@Table(name = "FAVORITO")
public class Favoritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "USUARIO_ID")
    private usuario usuario;
    @ManyToOne
    @JoinColumn(name = "VUELO_ID")
    private vuelo vuelo_id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public usuario getUsuario_id() {
        return usuario;
    }

    public void setUsuario_id(usuario usuario_id) {
        this.usuario = usuario_id;
    }

    public vuelo getVuelo_id() {
        return vuelo_id;
    }

    public void setVuelo_id(vuelo vuelo_id) {
        this.vuelo_id = vuelo_id;
    }
}
