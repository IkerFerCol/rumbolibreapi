package com.iker.rumbolibreapi.model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
    Optional<usuario> findByEmail(String email);
}

