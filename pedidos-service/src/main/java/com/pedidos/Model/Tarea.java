package com.ejemplo.tareas.models;

import jakarta.persistence.*;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String asignadoA;
    private boolean completada;

    public Tarea() {}

    public Tarea(String descripcion, String asignadoA, boolean completada) {
        this.descripcion = descripcion;
        this.asignadoA = asignadoA;
        this.completada = completada;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getAsignadoA() { return asignadoA; }
    public void setAsignadoA(String asignadoA) { this.asignadoA = asignadoA; }

    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }
}
