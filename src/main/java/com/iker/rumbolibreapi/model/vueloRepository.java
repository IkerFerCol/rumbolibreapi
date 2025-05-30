package com.iker.rumbolibreapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface vueloRepository extends JpaRepository<vuelo, Long> {
    List<vuelo> findByCiudadOrigenOrCiudadDestinoOrAerolinea(String origen, String destino, String aerolinea);
}

