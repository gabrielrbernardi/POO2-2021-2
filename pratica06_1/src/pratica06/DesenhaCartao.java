package pratica06;

public class DesenhaCartao extends DesenhaCartaoAbstract{
	public void desenha() {
		MensagemEspanhol msgEspanhol = new MensagemEspanhol("Feliz Natal");
		System.out.println(msgEspanhol.MostraMensagem());
		this.msgAlemao();
		this.desenhaCoracao();
	}

	public void msgEspanhol() {
		System.out.println("Feliz Navidad !!!");
	}
	public void msgAlemao() {
		System.out.println("Frohe Weihnachten !!!");
	}	
	public void desenhaCoracao() {
		System.out.println("\u2665");
	}
}
