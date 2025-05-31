package com.iker.rumbolibreapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface reservaRepository extends JpaRepository<reserva, Long> {
    List<reserva> findByUsuarioNombre(String nombreUsuario);
    reserva findByVueloIdAndUsuarioNombre(Long vueloId, String nombreUsuario);

}
