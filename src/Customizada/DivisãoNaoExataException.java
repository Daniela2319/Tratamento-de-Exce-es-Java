package Customizada;

public class DivisÃ£oNaoExataException extends Exception {

    private int numerado;
    private int denominador;

    public DivisÃ£oNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}
