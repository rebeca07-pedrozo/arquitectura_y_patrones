public class ConfiguracionUsuario {
    private String theme;

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public Memento guardarEstado() {
        return new Memento(theme);
    }

    public void restaurarEstado(Memento memento) {
        this.theme = memento.getTheme();
    }
}

public class Memento {
    private final String theme;

    public Memento(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }
}

public class Historial {
    private Stack<Memento> historial = new Stack<>();

    public void guardar(Memento m) {
        historial.push(m);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
}
