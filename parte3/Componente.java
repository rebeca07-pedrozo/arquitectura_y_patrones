interface Componente {
    void mostrar();
}

class Boton implements Componente {
    public void mostrar() {
        System.out.println("Botón mostrado");
    }
}

class Menu implements Componente {
    private List<Componente> componentes = new ArrayList<>();

    public void agregar(Componente componente) {
        componentes.add(componente);
    }

    public void mostrar() {
        System.out.println("Menú mostrado");
        for (Componente componente : componentes) {
            componente.mostrar();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Boton boton1 = new Boton();
        Boton boton2 = new Boton();
        Menu menu = new Menu();
        menu.agregar(boton1);
        menu.agregar(boton2);
        menu.mostrar();
    }
}
