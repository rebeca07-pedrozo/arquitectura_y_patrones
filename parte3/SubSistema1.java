class SubSistema1 {
    void facturar() {
        System.out.println("Facturando...");
    }
}

class SubSistema2 {
    void procesarPago() {
        System.out.println("Procesando pago...");
    }
}

class SubSistema3 {
    void enviarFactura() {
        System.out.println("Enviando factura...");
    }
}

class Fachada {
    private SubSistema1 subsistema1 = new SubSistema1();
    private SubSistema2 subsistema2 = new SubSistema2();
    private SubSistema3 subsistema3 = new SubSistema3();

    void realizarFacturacion() {
        subsistema1.facturar();
        subsistema2.procesarPago();
        subsistema3.enviarFactura();
    }
}

public class Main {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        fachada.realizarFacturacion();
    }
}
