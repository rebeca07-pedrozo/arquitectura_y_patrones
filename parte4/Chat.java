public class Chat {
    private EntradaTexto entradaTexto;
    private BotonEnviar botonEnviar;
    private Historial historial;

    public Chat() {
        this.entradaTexto = new EntradaTexto(this);
        this.botonEnviar = new BotonEnviar(this);
        this.historial = new Historial();
    }

    public void enviarMensaje(String mensaje) {
        historial.agregarMensaje(mensaje);
        entradaTexto.limpiar();
    }

    public void mostrarHistorial() {
        historial.mostrar();
    }
}

public class EntradaTexto {
    private Chat chat;

    public EntradaTexto(Chat chat) {
        this.chat = chat;
    }

    public void enviarTexto(String texto) {
        chat.enviarMensaje(texto);
    }

    public void limpiar() {
        System.out.println("Limpiando campo de texto");
    }
}
