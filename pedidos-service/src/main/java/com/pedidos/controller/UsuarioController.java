package com.usuarios.controller;

import com.usuarios.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public Usuario obtenerUsuario(@PathVariable Long id) {
        return new Usuario(id, "Laura Gómez", "Calle 123", "3014567890");
    }
}
