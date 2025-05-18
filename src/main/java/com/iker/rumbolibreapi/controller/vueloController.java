package com.iker.rumbolibreapi.controller;

import com.iker.rumbolibreapi.model.vuelo;
import com.iker.rumbolibreapi.model.vueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/vuelos")
public class vueloController {
    @Autowired
    vueloRepository vueloRepository;

    @GetMapping("/get")
    public List<vuelo> getAllVuelos() {
        return vueloRepository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        long count = vueloRepository.count();
        return "Total vuelos en BD: " + count;
    }

    @GetMapping("/buscar")
    public List<vuelo> buscarVuelos(
            @RequestParam(required = false, defaultValue = "") String ciudadOrigen,
            @RequestParam(required = false, defaultValue = "") String ciudadDestino,
            @RequestParam(required = false, defaultValue = "") String aerolinea) {

        if ((ciudadOrigen == null || ciudadOrigen.isEmpty()) &&
                (ciudadDestino == null || ciudadDestino.isEmpty()) &&
                (aerolinea == null || aerolinea.isEmpty())) {
            return getAllVuelos();
        }

        return vueloRepository
                .findByCiudadOrigenOrCiudadDestinoOrAerolinea(ciudadOrigen, ciudadDestino, aerolinea);
    }

    @GetMapping("/random")
    public ResponseEntity<vuelo> getRandomVuelo() {
        List<vuelo> vuelos = vueloRepository.findAll();
        if (vuelos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        vuelo vueloAleatorio = vuelos.get(new Random().nextInt(vuelos.size()));
        return ResponseEntity.ok(vueloAleatorio);
    }

}
