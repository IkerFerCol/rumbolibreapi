package com.iker.rumbolibreapi.controller;

import com.iker.rumbolibreapi.model.mensaje;
import com.iker.rumbolibreapi.model.mensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mensaje")
public class mensajeController {

    @Autowired
    private mensajeRepository mensajeRepository;

    @GetMapping
    public List<mensaje> getMensajes() {
        return mensajeRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<mensaje> crearMensaje(@RequestBody mensaje mensaje) {
        mensaje guardado = mensajeRepository.save(mensaje);
        return ResponseEntity.ok(guardado);
    }
}
