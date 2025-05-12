@RestController
@RequestMapping("/pagos")
public class PagoController {

    @PostMapping
    public String procesarPago(@RequestBody Pago pago) {
        return "Pago procesado para la reserva " + pago.getReservaId() + ". Estado: " + pago.getEstado();
    }
}
