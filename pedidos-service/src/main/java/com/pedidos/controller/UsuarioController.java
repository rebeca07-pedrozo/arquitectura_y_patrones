@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        return new Usuario(id, "Juan Pérez", "juan@correo.com", "1234");
    }
}
