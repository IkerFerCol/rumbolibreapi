package com.iker.rumbolibreapi.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vuelo")
public class vuelo {

    public vuelo(String ciudadOrigen, String ciudadDestino, String aerolinea, String horaInicioIda, String horaFinIda, String fechaInicioIda, String fechaFinIda, String tiempoIda, String horaInicioVuelta, String horaFinVuelta, String fechaInicioVuelta, String fechaFinVuelta, String tiempoVuelta, double precio) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.aerolinea = aerolinea;
        this.horaInicioIda = horaInicioIda;
        this.horaFinIda = horaFinIda;
        this.fechaInicioIda = fechaInicioIda;
        this.fechaFinIda = fechaFinIda;
        this.tiempoIda = tiempoIda;
        this.horaInicioVuelta = horaInicioVuelta;
        this.horaFinVuelta = horaFinVuelta;
        this.fechaInicioVuelta = fechaInicioVuelta;
        this.fechaFinVuelta = fechaFinVuelta;
        this.tiempoVuelta = tiempoVuelta;
        this.precio = precio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CIUDADORIGEN")
    private String ciudadOrigen;
    @Column(name = "CIUDADDESTINO")
    private String ciudadDestino;
    @Column(name = "AEROLINEA")
    private String aerolinea;

    @Column(name = "HORAINICIOIDA")
    private String horaInicioIda;
    @Column(name = "HORAFINIDA")
    private String horaFinIda;
    @Column(name = "FECHAINICIOIDA")
    private String fechaInicioIda;
    @Column(name = "FECHAFINIDA")
    private String fechaFinIda;
    @Column(name = "TIEMPOIDA")
    private String tiempoIda;

    @Column(name = "HORAINICIOVUELTA")
    private String horaInicioVuelta;
    @Column(name = "HORAFINVUELTA")
    private String horaFinVuelta;
    @Column(name = "FECHAINICIOVUELTA")
    private String fechaInicioVuelta;
    @Column(name = "FECHAFINVUELTA")
    private String fechaFinVuelta;
    @Column(name = "TIEMPOVUELTA")
    private String tiempoVuelta;

    @Column(name = "PRECIO")
    private double precio;



    public vuelo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getHoraInicioIda() {
        return horaInicioIda;
    }

    public void setHoraInicioIda(String horaInicioIda) {
        this.horaInicioIda = horaInicioIda;
    }

    public String getHoraFinIda() { return horaFinIda; }

    public void setHoraFinIda(String horaFinIda) {
        this.horaFinIda = horaFinIda;
    }

    public String getFechaInicioIda() {
        return fechaInicioIda;
    }

    public void setFechaInicioIda(String fechaInicioIda) {
        this.fechaInicioIda = fechaInicioIda;
    }

    public String getFechaFinIda() {
        return fechaFinIda;
    }

    public void setFechaFinIda(String fechaFinIda) {
        this.fechaFinIda = fechaFinIda;
    }

    public String getTiempoIda() {
        return tiempoIda;
    }

    public void setTiempoIda(String tiempoIda) {
        this.tiempoIda = tiempoIda;
    }

    public String getHoraInicioVuelta() {
        return horaInicioVuelta;
    }

    public void setHoraInicioVuelta(String horaInicioVuelta) { this.horaInicioVuelta = horaInicioVuelta; }

    public String getHoraFinVuelta() {
        return horaFinVuelta;
    }

    public void setHoraFinVuelta(String horaFinVuelta) {
        this.horaFinVuelta = horaFinVuelta;
    }

    public String getFechaInicioVuelta() {
        return fechaInicioVuelta;
    }

    public void setFechaInicioVuelta(String fechaInicioVuelta) {
        this.fechaInicioVuelta = fechaInicioVuelta;
    }

    public String getFechaFinVuelta() {
        return fechaFinVuelta;
    }

    public void setFechaFinVuelta(String fechaFinVuelta) {
        this.fechaFinVuelta = fechaFinVuelta;
    }

    public String getTiempoVuelta() {
        return tiempoVuelta;
    }

    public void setTiempoVuelta(String tiempoVuelta) {
        this.tiempoVuelta = tiempoVuelta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

