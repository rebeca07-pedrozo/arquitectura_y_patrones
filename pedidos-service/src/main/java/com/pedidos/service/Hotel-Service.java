public class Hotel {
    private Long id;
    private String nombre;
    private String ubicacion;

    public Hotel() {}

    public Hotel(Long id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
}
