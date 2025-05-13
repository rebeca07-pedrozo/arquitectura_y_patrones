public interface Iterator {
    boolean hasNext();
    Producto next();
}

public class ProductoIterator implements Iterator {
    private List<Producto> productos;
    private int posicion = 0;

    public ProductoIterator(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public boolean hasNext() {
        return posicion < productos.size();
    }

    @Override
    public Producto next() {
        return productos.get(posicion++);
    }
}
