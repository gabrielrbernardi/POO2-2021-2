package teste01;

public class Carro {
	static int ID = 0;
	String nome;
	double preco;
	
	public Carro() {
		super();
		ID = ID + 1;
	}

	public static int getID() {
		return ID;
	}

	public static void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double d) {
		this.preco = d;
	}

	@Override
	public String toString() {
		return "Carro [ID = " + ID + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
