package pratica06_2;

public class Soma implements Expressao {
    private Expressao a;
    private Expressao b;

    public Soma(Expressao a, Expressao b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int reduzido() {
        return a.reduzido() + b.reduzido();  //converte os valores
    }
}
