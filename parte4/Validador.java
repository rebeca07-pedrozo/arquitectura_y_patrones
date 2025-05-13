public abstract class Validador {
    protected Validador siguiente;

    public void setSiguiente(Validador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract boolean validar(String input);
}

public class ValidadorCamposVacios extends Validador {
    @Override
    public boolean validar(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Campo vacío");
            return false;
        }
        return siguiente != null && siguiente.validar(input);
    }
}
