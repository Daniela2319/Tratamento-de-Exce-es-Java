package Customizada;

public class DivisãoNaoExataException extends Exception {

    private int numerado;
    private int denominador;

    public DivisãoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
}
