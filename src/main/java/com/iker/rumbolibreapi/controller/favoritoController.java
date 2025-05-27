package com.iker.rumbolibreapi.controller;

import com.iker.rumbolibreapi.model.Favoritos;
import com.iker.rumbolibreapi.model.FavoritosRepository;
import com.iker.rumbolibreapi.model.usuario;
import com.iker.rumbolibreapi.model.vuelo;
import com.iker.rumbolibreapi.model.usuarioRepository;
import com.iker.rumbolibreapi.model.vueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/favoritos")
public class favoritoController {

    @Autowired
    private usuarioRepository usuarioRepository;

    @Autowired
    private vueloRepository vueloRepository;

    // Añadir vuelo a favoritos
    @PostMapping("/{usuarioId}/agregar/{vueloId}")
    public ResponseEntity<?> agregarFavorito(@PathVariable Long usuarioId, @PathVariable Long vueloId) {
        Optional<usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
        Optional<vuelo> vueloOpt = vueloRepository.findById(vueloId);

        if (usuarioOpt.isPresent() && vueloOpt.isPresent()) {
            usuario usuario = usuarioOpt.get();
            vuelo vuelo = vueloOpt.get();
            usuario.getFavoritos().add(vuelo);
            usuarioRepository.save(usuario);
            return ResponseEntity.ok("Vuelo añadido a favoritos");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario o vuelo no encontrado");
        }
    }

    // Eliminar vuelo de favoritos
    @DeleteMapping("/{usuarioId}/eliminar/{vueloId}")
    public ResponseEntity<?> eliminarFavorito(@PathVariable Long usuarioId, @PathVariable Long vueloId) {
        Optional<usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
        Optional<vuelo> vueloOpt = vueloRepository.findById(vueloId);

        if (usuarioOpt.isPresent() && vueloOpt.isPresent()) {
            usuario usuario = usuarioOpt.get();
            vuelo vuelo = vueloOpt.get();
            usuario.getFavoritos().remove(vuelo);
            usuarioRepository.save(usuario);
            return ResponseEntity.ok("Vuelo eliminado de favoritos");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario o vuelo no encontrado");
        }
    }

    // Listar favoritos de un usuario
    @GetMapping("/{usuarioId}")
    public ResponseEntity<?> obtenerFavoritos(@PathVariable Long usuarioId) {
        Optional<usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
        if (usuarioOpt.isPresent()) {
            return ResponseEntity.ok(usuarioOpt.get().getFavoritos());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
    }
}
