package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class MaterialBiblioteca {
	private String titulo;
	private int ano;
	public static ArrayList<Livros> livrosList = new ArrayList<Livros>();
	public static ArrayList<Revistas> revistasList = new ArrayList<Revistas>();
	static Map<Integer, Integer[]> indiceMap = new HashMap<Integer, Integer[]>();  //Id, [tipo, indice]
	public static int ID = 0;
//	public static ArrayList<IndexTemplate> indiceList = new ArrayList<IndexTemplate>();
		
	public MaterialBiblioteca() {
		ID = ID + 1;
	}
	
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
			
	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public static String print() {
		String str = "";
		for(int i = 1; i <= indiceMap.size(); i++) {
			if(indiceMap.get(i)[0] == 1) { // eh um livro
				str += "Livro";
				str += "\n    Título: " + livrosList.get(indiceMap.get(i)[1]).getTitulo();
				str += "\n    Autor: " + livrosList.get(indiceMap.get(i)[1]).getAutor();
				str += "\n    Ano: " + livrosList.get(indiceMap.get(i)[1]).getAno();
				str += "\n";
			}else { // eh uma revista
				str += "Revista";
				str += "\n     Título: " + revistasList.get(indiceMap.get(i)[1]).getTitulo();								
				str += "\n     Organização: " + revistasList.get(indiceMap.get(i)[1]).getOrganizacao();								
				str += "\n     Volume: " + revistasList.get(indiceMap.get(i)[1]).getVolume();								
				str += "\n     Numero: " + revistasList.get(indiceMap.get(i)[1]).getNumero();								
				str += "\n     Ano: " + revistasList.get(indiceMap.get(i)[1]).getAno();
				str += "\n";
			}
		}
		return str;
	}
}
