public class Pago {
    private Long id;
    private Long reservaId;
    private Double monto;
    private String estado;

    public Pago() {}

    public Pago(Long id, Long reservaId, Double monto, String estado) {
        this.id = id;
        this.reservaId = reservaId;
        this.monto = monto;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getReservaId() { return reservaId; }
    public void setReservaId(Long reservaId) { this.reservaId = reservaId; }

    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
