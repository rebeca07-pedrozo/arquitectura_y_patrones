public class Producto {
    private List<Observer> observers = new ArrayList<>();
    private double precio;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(precio);
        }
    }
}

public interface Observer {
    void update(double precio);
}

public class Cliente implements Observer {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(double precio) {
        System.out.println("El cliente " + nombre + " ha sido notificado de un cambio de precio: " + precio);
    }
}
