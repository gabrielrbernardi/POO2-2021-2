package pratica06;

public class Teste {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\n\nCartao " + (i + 1));
			DesenhaCartaoAbstract dca = new DesenhaCartao();
			dca.desenha();			
		}
	}
}
