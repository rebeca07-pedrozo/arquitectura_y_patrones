package com.productos.controller;

import com.productos.model.Producto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {
        return new Producto(id, "Hamburguesa doble carne", 18000.0);
    }
}
