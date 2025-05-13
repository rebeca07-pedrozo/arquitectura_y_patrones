public interface Estado {
    void manejarOrden(Orden orden);
}

public class OrdenPendiente implements Estado {
    @Override
    public void manejarOrden(Orden orden) {
        System.out.println("La orden está pendiente");
        orden.setEstado(new OrdenProcesando());
    }
}

public class OrdenProcesando implements Estado {
    @Override
    public void manejarOrden(Orden orden) {
        System.out.println("La orden está siendo procesada");
        orden.setEstado(new OrdenEnviada());
    }
}

public class Orden {
    private Estado estado;

    public Orden() {
        this.estado = new OrdenPendiente();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void manejar() {
        estado.manejarOrden(this);
    }
}
