package com.iker.rumbolibreapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mensajeRepository extends JpaRepository<mensaje, Long> {
}
