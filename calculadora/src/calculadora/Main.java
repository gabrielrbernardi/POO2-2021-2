package calculadora;

import java.util.Scanner;

public class Main {
	/* Calculadora com as opcoes
	 * Somar
	 * Subtrair
	 * Multiplicar
	 * Dividir
	 * */
	public static void menu() {
		System.out.println("=====MENU=====");
		System.out.println(" 1 - Somar");
		System.out.println(" 2 - Subtrair");
		System.out.println(" 3 - Multiplicar");
		System.out.println(" 4 - Dividir");
		System.out.print("Escolha: ");
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Operacoes op = new Operacoes();
		Main.menu(); ///Imprime o menu na tela
		
		int operacao = entrada.nextInt();
		
		if(operacao <= 0 || operacao > 4) {
			System.out.println("Operacao escolhida invalida");
			return;
		}
		
		double val1, val2;
		System.out.print("Digite o primeiro valor: ");
		val1 = entrada.nextDouble();
		System.out.print("Digite o segundo valor: ");
		val2 = entrada.nextDouble();
		
		if(operacao == 1) {
			double resultadoSoma = op.soma(val1, val2);
			System.out.println(resultadoSoma);
		}else if(operacao == 2) {
			double resultado = op.diferenca(val1, val2);
			System.out.println(resultado);
		}else if(operacao == 3) {
			double resultado = op.multiplica(val1, val2);
			System.out.println(resultado);
		}else if(operacao == 4) {
			double resultado = op.divide(val1, val2);
			System.out.println(resultado);
		}
		
		entrada.close();
	}

}
