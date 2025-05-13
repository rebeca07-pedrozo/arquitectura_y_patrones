interface Mensaje {
    void enviar(String mensaje);
}

class EnviarMensaje implements Mensaje {
    public void enviar(String mensaje) {
        System.out.println("Mensaje enviado: " + mensaje);
    }
}

class MensajeDecorador implements Mensaje {
    protected Mensaje mensaje;

    public MensajeDecorador(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public void enviar(String mensaje) {
        this.mensaje.enviar(mensaje);
    }
}

class CifradoDecorator extends MensajeDecorador {
    public CifradoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        mensaje = "Cifrado: " + mensaje;
        super.enviar(mensaje);
    }
}

class CompresionDecorator extends MensajeDecorador {
    public CompresionDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        mensaje = "Comprimido: " + mensaje;
        super.enviar(mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        Mensaje mensaje = new EnviarMensaje();
        Mensaje cifrado = new CifradoDecorator(mensaje);
        Mensaje comprimido = new CompresionDecorator(cifrado);
        comprimido.enviar("Hola");
    }
}
