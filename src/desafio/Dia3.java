package desafio;

import java.util.Arrays;

public class Dia3 {
//11. Escreva um programa Java para reverter um array de valores inteiros.
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 10 };
		System.out.printf("Array Original: ");
		System.out.printf(Arrays.toString(array));

		int tamanho = array.length;
		int[] arrayInvertido = new int[tamanho];
		int tamanhoVetorOriginal = tamanho - 1;
		///inverter o array
		for (int i = 0; i < arrayInvertido.length; i++) {
			arrayInvertido[i] = array[tamanhoVetorOriginal-i];
		}
		//printar o array invertido
		System.out.printf("\nArray Invertido: ");
		System.out.println(Arrays.toString(arrayInvertido));
		
		/*System.out.println("\nArray invertido: ");
		for (int i = 0; i < arrayInvertido.length; i++) {
			System.out.printf("%d ", arrayInvertido[i]);
		}*/

	}

}
