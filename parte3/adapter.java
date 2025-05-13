interface Pagador {
    void procesarPago(double cantidad);
}

class PagoAPI {
    void pagarConTarjeta(String numero, double cantidad) {
        System.out.println("Pago de " + cantidad + " procesado con tarjeta " + numero);
    }
}

class PagadorAdaptado implements Pagador {
    private PagoAPI apiPago;

    public PagadorAdaptado(PagoAPI api) {
        this.apiPago = api;
    }

    @Override
    public void procesarPago(double cantidad) {
        apiPago.pagarConTarjeta("1234-5678-9876-5432", cantidad);
    }
}

public class Main {
    public static void main(String[] args) {
        PagoAPI api = new PagoAPI();
        Pagador pagador = new PagadorAdaptado(api);
        pagador.procesarPago(100.50);
    }
}
