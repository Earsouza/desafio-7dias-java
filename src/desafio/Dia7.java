package desafio;

public class Dia7 {

	public static void main(String[] args) {

		int []vetor = {2,3,3,4,5,6,7,8};
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			 soma = soma + vetor[i];
			
		}
		System.out.println("Soma total do vetor: " + soma);
	}

}
