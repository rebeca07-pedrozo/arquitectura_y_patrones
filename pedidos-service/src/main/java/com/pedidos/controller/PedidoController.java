package com.pedidos.controller;

import com.pedidos.model.Pedido;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @PostMapping
    public String crearPedido(@RequestBody Pedido pedido) {
        return "Pedido recibido: Usuario " + pedido.getUsuarioId() +
                ", Producto " + pedido.getProductoId() +
                ", Repartidor " + pedido.getRepartidorId() +
                ", Estado: " + pedido.getEstado();
    }
}
