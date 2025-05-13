public abstract class TareaAutomatizada {
    public void ejecutar() {
        paso1();
        paso2();
        paso3();
    }

    protected abstract void paso1();
    protected abstract void paso2();
    protected abstract void paso3();
}

public class TareaBackup extends TareaAutomatizada {
    @Override
    protected void paso1() {
        System.out.println("Iniciando backup");
    }

    @Override
    protected void paso2() {
        System.out.println("Realizando backup");
    }

    @Override
    protected void paso3() {
        System.out.println("Backup finalizado");
    }
}
