package desafio;

import java.util.Scanner;

public class Dia1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int tamanho;
		int soma = 0;

		System.out.println("Informe a quantidade de números que serão somados: ");
		tamanho = s.nextInt();

		int[] calcula = new int[tamanho];

		for (int i = 0; i < calcula.length; i++) {
			System.out.printf("\n Informe o %d valor:", i + 1);
			calcula[i] = s.nextInt();
			soma = soma + calcula[i];

		}
		System.out.println("\n Total: " + soma);
		s.close();
	}
}
