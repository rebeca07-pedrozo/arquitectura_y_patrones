@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @PostMapping
    public String crearReserva(@RequestBody Reserva reserva) {
        return "Reserva creada del usuario " + reserva.getUsuarioId() + " en habitación " + reserva.getHabitacionId();
    }
}
