package controller;

import model.BibliotecaModel;

public class Livros extends MaterialBiblioteca {
	private String autor;

	public Livros(String titulo, String autor, int ano) {
		setTitulo(titulo);
		setAno(ano);
		
		setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void add(Livros L) {
		try {
			BibliotecaModel.InserirLivro(L);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		livrosList.add(L);
//		Integer[] array = {1, livrosList.size()-1};
//		Livros.indiceMap.put(getID(), array);
	}
}