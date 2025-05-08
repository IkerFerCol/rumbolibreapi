package com.iker.rumbolibreapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface vueloRepository extends JpaRepository<vuelo, Long> {
    List<vuelo> findByCiudadOrigenOrCiudadDestinoOrAerolinea(String origen, String destino, String aerolinea);
}

