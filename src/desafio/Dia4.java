package desafio;

import java.util.Arrays;

public class Dia4 {
//15. Escreva um programa Java para encontrar os elementos comuns entre dois arrays de inteiros. 
	public static void main(String[] args) {
		
		int[] vetor1 = {7,8,9,10, 11};
		int[] vetor2= {10,11,12,13};
		
		System.out.println("Valores do primeiro vetor: " + Arrays.toString(vetor1));
		System.out.println("Valores do segundo vetor: " + Arrays.toString(vetor2));
		
		System.out.printf("\nOs valores em comum são:");
		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				
				if((vetor1[i])==(vetor2[j])) {
					System.out.printf(" %d ", vetor1[i]);
				}
			}
		}
		
	}

}
