@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    @GetMapping("/{id}")
    public Habitacion getHabitacion(@PathVariable Long id) {
        return new Habitacion(id, 1L, "Suite", 250000.0);
    }
}
