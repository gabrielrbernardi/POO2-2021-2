package media;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tamanho = 2;
		Scanner entrada = new Scanner(System.in);
		
		Aluno a[] = new Aluno[tamanho];
		for(int i = 0; i < tamanho; i++) {
			Aluno al = new Aluno();
			System.out.print("Digite o nome: ");
			String nomeString = entrada.nextLine();
			
			double n1, n2, n3;
			System.out.print("Digite a nota 1: ");
			n1 = entrada.nextDouble();
			System.out.print("Digite a nota 2: ");
			n2 = entrada.nextDouble();
			System.out.print("Digite a nota 3: ");
			n3 = entrada.nextDouble();
			
			al.setNomeAluno(nomeString);
			al.setN1(n1);
			al.setN2(n2);
			al.setN3(n3);
			al.calculaMedia();
			a[i] = new Aluno(al);
		}
		
		for(int i = 0; i < tamanho; i++) {
			System.out.println(a[i].toString());
		}
		entrada.close();		
	}

}
