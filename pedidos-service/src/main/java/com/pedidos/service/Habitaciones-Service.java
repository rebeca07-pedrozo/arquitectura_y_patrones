public class Habitacion {
    private Long id;
    private Long hotelId;
    private String tipo;
    private Double precio;

    public Habitacion() {}

    public Habitacion(Long id, Long hotelId, String tipo, Double precio) {
        this.id = id;
        this.hotelId = hotelId;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getHotelId() { return hotelId; }
    public void setHotelId(Long hotelId) { this.hotelId = hotelId; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
}
