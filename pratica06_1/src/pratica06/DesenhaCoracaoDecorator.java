package pratica06;

public class DesenhaCoracaoDecorator extends DesenhaCartaoDecorator {
	
	public DesenhaCoracaoDecorator(DesenhaCartaoAbstract DCA) {
		super(DCA);
	}
	
	public void desenha() {
		desenhaCoracao();
		dCA.desenha();
	}
	
	private void desenhaCoracao() {
		System.out.println("\u2665");
	}
}
