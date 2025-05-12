public class Reserva {
    private Long id;
    private Long usuarioId;
    private Long habitacionId;
    private String fechaInicio;
    private String fechaFin;

    public Reserva() {}

    public Reserva(Long id, Long usuarioId, Long habitacionId, String fechaInicio, String fechaFin) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.habitacionId = habitacionId;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public Long getHabitacionId() { return habitacionId; }
    public void setHabitacionId(Long habitacionId) { this.habitacionId = habitacionId; }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
}
