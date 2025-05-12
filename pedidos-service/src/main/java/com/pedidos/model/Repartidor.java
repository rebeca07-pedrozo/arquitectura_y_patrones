package com.repartidores.model;

public class Repartidor {
    private Long id;
    private String nombre;
    private String vehiculo;

    public Repartidor() {
    }

    public Repartidor(Long id, String nombre, String vehiculo) {
        this.id = id;
        this.nombre = nombre;
        this.vehiculo = vehiculo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}
