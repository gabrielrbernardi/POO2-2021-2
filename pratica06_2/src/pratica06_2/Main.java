package pratica06_2;

public class Main {
    public String saudacoes() {
        return "Ola pessoas!";
    }

    public static void main(String[] args) {
    	System.out.println("Letra A) 0");
    	Valor val = new Valor(0);
    	System.out.println(val.reduzido());
    	
    	System.out.println("\n\nLetra B) 1+2");
    	Soma som = new Soma(new Valor(1), new Valor(2));
    	System.out.println(som.reduzido());
    	
    	
    	System.out.println("\n\nLetra C) 1 * (2 + 3)");
    	Soma soma = new Soma(new Valor(2), new Valor(3));
    	Multiplicacao mult = new Multiplicacao(new Valor(1), new Valor(soma.reduzido()));
    	System.out.println(mult.reduzido());
    	
    	System.out.println("\n\nLetra D) (2* 3) + (4 /  (5 - 3))");
    	Subtracao sub = new Subtracao(new Valor(5), new Valor(3));
    	Divisao div = new Divisao(new Valor(4), new Valor(sub.reduzido()));
    	Multiplicacao multiplicacao = new Multiplicacao(new Valor(2), new Valor(3));
    	Soma soma1 = new Soma(new Valor(multiplicacao.reduzido()), new Valor(div.reduzido()));
    	System.out.println(soma1.reduzido());
    	
    	
        System.out.println(new Main().saudacoes());
    }
}
