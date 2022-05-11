package teste01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Carro carro = new Carro();
		carro.setNome("fiat");
		carro.setPreco(1000.00);
		
		Carro carro02 = new Carro();
		carro02.setNome("ford");
		carro02.setPreco(1234.00);
			
		System.out.println(carro.toString());		
		System.out.println(carro02.toString());		
		
		Matematica mat = new Matematica();
		
		System.out.println(mat.toString());
		entrada.close();
	}

}
