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
    private String theme;

    public Memento(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }
}
