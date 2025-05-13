interface BaseDeDatos {
    void consultar();
}

class BaseDeDatosReal implements BaseDeDatos {
    public void consultar() {
        System.out.println("Consultando base de datos...");
    }
}

class ProxyBaseDeDatos implements BaseDeDatos {
    private BaseDeDatosReal baseDeDatosReal;

    public ProxyBaseDeDatos(BaseDeDatosReal baseDeDatosReal) {
        this.baseDeDatosReal = baseDeDatosReal;
    }

    public void consultar() {
        if (validarAcceso()) {
            baseDeDatosReal.consultar();
        } else {
            System.out.println("Acceso denegado");
        }
    }

    private boolean validarAcceso() {
        return false; 
    }
}

public class Main {
    public static void main(String[] args) {
        BaseDeDatosReal baseDeDatosReal = new BaseDeDatosReal();
        BaseDeDatos proxy = new ProxyBaseDeDatos(baseDeDatosReal);
        proxy.consultar();
    }
}
