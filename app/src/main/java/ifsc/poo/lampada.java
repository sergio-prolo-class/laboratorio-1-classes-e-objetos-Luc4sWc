package ifsc.poo;

public class lampada {
    boolean estado;

    public void ligar() {
        estado = true;
        return;
    }

    public void desligar() {
        estado = false;
        return;
    }

    boolean getEstado() {
        return estado;
    }
}
