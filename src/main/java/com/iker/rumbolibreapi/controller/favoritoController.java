package com.iker.rumbolibreapi.controller;

import com.iker.rumbolibreapi.model.Favoritos;
import com.iker.rumbolibreapi.model.FavoritosRepository;
import com.iker.rumbolibreapi.model.usuario;
import com.iker.rumbolibreapi.model.vuelo;
import com.iker.rumbolibreapi.model.usuarioRepository;
import com.iker.rumbolibreapi.model.vueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/favoritos")
public class favoritoController {

    @Autowired
    private FavoritosRepository favoritosRepository;

    @Autowired
    private usuarioRepository usuarioRepository;

    @Autowired
    private vueloRepository vueloRepository;

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Favoritos>> getFavoritosByUsuario(@PathVariable Long usuarioId) {
        List<Favoritos> favoritos = favoritosRepository.findByUsuario_id(usuarioId);
        return ResponseEntity.ok(favoritos);
    }

    @PostMapping
    public ResponseEntity<?> addFavorito(@RequestParam Long usuarioId, @RequestParam Long vueloId) {
        Optional<usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
        Optional<vuelo> vueloOpt = vueloRepository.findById(vueloId);

        if (usuarioOpt.isPresent() && vueloOpt.isPresent()) {
            Favoritos favorito = new Favoritos();
            favorito.setUsuario_id(usuarioOpt.get());
            favorito.setVuelo_id(vueloOpt.get());
            favoritosRepository.save(favorito);
            return ResponseEntity.ok(favorito);
        } else {
            return ResponseEntity.badRequest().body("Usuario o vuelo no encontrado.");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFavorito(@PathVariable Long id) {
        Optional<Favoritos> favorito = favoritosRepository.findById(id);
        if (favorito.isPresent()) {
            favoritosRepository.deleteById(id);
            return ResponseEntity.ok().body("Favorito eliminado.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
