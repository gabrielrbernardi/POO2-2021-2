package pratica01;

public class Revista extends MaterialBiblioteca {
	private String organizacao;
	private int volume, numero;
	
	public Revista(String organizacao, int volume, int numero, String titulo, int ano) {
		setTitulo(titulo);
		setAno(ano);
		
		setOrganizacao(organizacao);
		setVolume(volume);
		setNumero(numero);
	}

	public String getOrganizacao() {
		return organizacao;
	}
	
	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
