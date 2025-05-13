public interface Visitor {
    void visit(ProductoAlimento producto);
    void visit(ProductoTecnologia producto);
}

public class ImpuestoVisitor implements Visitor {
    @Override
    public void visit(ProductoAlimento producto) {
        System.out.println("Calculando impuestos para alimento");
    }

    @Override
    public void visit(ProductoTecnologia producto) {
        System.out.println("Calculando impuestos para tecnología");
    }
}
