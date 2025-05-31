package com.iker.rumbolibreapi.controller;

import com.iker.rumbolibreapi.model.reserva;
import com.iker.rumbolibreapi.model.reservaRepository;
import com.iker.rumbolibreapi.model.vueloRepository;
import com.iker.rumbolibreapi.model.vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reserva")
public class reservaController {

    @Autowired
    private reservaRepository reservaRepository;

    @Autowired
    private vueloRepository vueloRepository;

    @PostMapping
    public reserva hacerReserva(@RequestBody reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @GetMapping
    public List<reserva> getReservas() {
        return reservaRepository.findAll();
    }

    @GetMapping("/usuario/{nombreUsuario}")
    public ResponseEntity<List<reserva>> obtenerReservasPorUsuario(@PathVariable String nombreUsuario) {
        List<reserva> reservas = reservaRepository.findByUsuarioNombre(nombreUsuario);
        if (reservas.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(reservas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReserva(@PathVariable Long id) {
        Optional<reserva> reservaOpt = reservaRepository.findById(id);

        if (reservaOpt.isPresent()) {
            reservaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
