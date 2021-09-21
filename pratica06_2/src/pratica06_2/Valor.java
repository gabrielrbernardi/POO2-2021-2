package pratica06_2;

public class Valor implements Expressao {
    private final int valor;

    public Valor(int number) {
        this.valor = number;

    }

    @Override
    public int reduzido() {
        return this.valor;
    }


}
