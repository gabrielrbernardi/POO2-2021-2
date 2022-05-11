package sorteador;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(gerador.nextInt(5));
		}

	}

}
