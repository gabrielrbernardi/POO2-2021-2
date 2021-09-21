package pratica06_2;

public class Multiplicacao implements Expressao {
    private final Expressao val1, val2;


    public Multiplicacao(Expressao valor1, Expressao valor2) {
        this.val1 = valor1;
        this.val2 = valor2;
    }


    @Override
    public int reduzido() {
        return val1.reduzido() * val2.reduzido();  //converte os valores
    }
}
