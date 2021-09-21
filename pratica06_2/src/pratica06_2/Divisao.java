package pratica06_2;

public class Divisao implements Expressao {
    private Expressao numerador, denominador;
    
    Divisao(Expressao numerador, Expressao denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public int reduzido() {
        return numerador.reduzido() / denominador.reduzido(); //converte os valores
    }
}
