package visitor;


public class SomaConvencional {
	
	public void somaDois(int x, int y) {
		int soma = x + y;
		System.out.printf(x + " + " + y + " = " + soma);
	}

	public void somaTres(int x, int y, int z) {
		int soma = x + y + z;
		System.out.printf(x + " + " + y + " + " + z + " = " + soma);
	}

}
