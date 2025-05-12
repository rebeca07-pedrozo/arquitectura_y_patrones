package com.repartidores.controller;

import com.repartidores.model.Repartidor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repartidores")
public class RepartidorController {

    @GetMapping("/{id}")
    public Repartidor obtenerRepartidor(@PathVariable Long id) {
        return new Repartidor(id, "Carlos Díaz", "Moto Yamaha");
    }
}
