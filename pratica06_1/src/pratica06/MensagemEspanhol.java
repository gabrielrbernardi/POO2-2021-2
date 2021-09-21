package pratica06;

public class MensagemEspanhol {
	private String mensagem;
	
	public MensagemEspanhol(String msg) {
		this.mensagem = msg;
	}
	
	public String MostraMensagem() {
		MensagemIngles msgIngles = new MensagemIngles("Feliz natal !!!");
		return (msgIngles.MostraMensagem() + "\nFeliz Navidad !!!");
	}
}
