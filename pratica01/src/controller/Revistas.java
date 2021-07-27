package controller;

public class Revistas extends MaterialBiblioteca {
	private String organizacao;
	private int volume, numero;
	
	public Revistas(String titulo, int ano, String organizacao, int volume, int numero) {
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
	
	public void add(Revistas R) {
		revistasList.add(R);
		Integer[] array = {2, revistasList.size()-1};
		Revistas.indiceMap.put(getID(), array);
	}
	
}
