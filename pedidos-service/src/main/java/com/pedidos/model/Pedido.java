package com.pedidos.model;

public class Pedido {
    private Long id;
    private Long usuarioId;
    private Long productoId;
    private Long repartidorId;
    private String estado;

    public Pedido() {
    }

    public Pedido(Long id, Long usuarioId, Long productoId, Long repartidorId, String estado) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.productoId = productoId;
        this.repartidorId = repartidorId;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getRepartidorId() {
        return repartidorId;
    }

    public void setRepartidorId(Long repartidorId) {
        this.repartidorId = repartidorId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
