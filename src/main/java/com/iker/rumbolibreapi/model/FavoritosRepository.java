package com.iker.rumbolibreapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoritosRepository extends JpaRepository<Favoritos, Long> {
    List<Favoritos> findByUsuario_id(Long usuario_id);
}
