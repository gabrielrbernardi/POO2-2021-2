package pratica01;

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
	
	public void print() {
		for(int i = 0; i < biblioteca.size(); i++) {
			System.out.println(biblioteca.get(i).getTitulo());
		}
	}
}
