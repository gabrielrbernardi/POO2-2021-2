package pratica01;

import java.util.ArrayList;

public abstract class MaterialBiblioteca {
	private String titulo;
	private int ano;
	public static ArrayList<MaterialBiblioteca> biblioteca = new ArrayList<MaterialBiblioteca>();
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
//	public void print() {
//		for(int i = 0; i < biblioteca.size(); i++) {
//			System.out.println(biblioteca.get(i).getAutor());
//		}
//	}
}
