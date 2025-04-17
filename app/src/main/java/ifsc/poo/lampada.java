package ifsc.poo;

public class lampada {
    private static boolean estado;
    private static int quantidade = 0;

    public boolean ligar() {
        quantidade++;
        return estado = true;

    }

    public boolean desligar() {
        quantidade++;
        return estado = false;
    }

    boolean getEstado() {
        return estado;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
