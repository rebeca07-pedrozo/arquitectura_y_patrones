@RestController
@RequestMapping("/hoteles")
public class HotelController {

    @GetMapping("/{id}")
    public Hotel getHotel(@PathVariable Long id) {
        return new Hotel(id, "Hotel El Refugio", "Cartagena");
    }
}
