package com.iker.rumbolibreapi.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface usuarioRepository extends JpaRepository<usuario, Long> {
    Optional<usuario> findByEmail(String email);
}

