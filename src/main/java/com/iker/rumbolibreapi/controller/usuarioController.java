package com.iker.rumbolibreapi.controller;
import com.iker.rumbolibreapi.model.usuario;
import com.iker.rumbolibreapi.model.usuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class usuarioController {

    @Autowired
    private usuarioRepository usuarioRepository;

    @PostMapping("/registro")
    public usuario registrarUsuario(@RequestBody usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PostMapping("/login")
    public usuario login(@RequestBody usuario usuario) {
        return usuarioRepository.findByEmail(usuario.getEmail())
                .filter(u -> u.getContrasena().equals(usuario.getContrasena()))
                .orElse(null);
    }

    @GetMapping("/get")
    public List<usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<usuario> getUsuarioById(@PathVariable Long id) {
        return usuarioRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
