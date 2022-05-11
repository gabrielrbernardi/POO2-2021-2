package media;

public class Aluno {
	private String nomeAluno;
	private double n1, n2, n3, media;
	
	public Aluno () {
		
	}
	
	public Aluno(Aluno al) {
		this.setNomeAluno(al.getNomeAluno());
		this.setN1(al.getN1());
		this.setN2(al.getN2());
		this.setN3(al.getN3());
		this.setMedia(al.getMedia());
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", media=" + media
				+ ", toString()=" + super.toString() + "]";
	}
	
	public void calculaMedia() {
		double resultado = (this.getN1() + this.getN2() + this.getN3())/3.0;
		this.setMedia(resultado);
	}
	
	
}
