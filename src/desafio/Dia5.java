package desafio;

public class Dia5 {

	//16. Escreva um programa Java para remover elementos duplicados de um array. 
	public static void main(String[] args) {
	
	    int array[] = { 1, 2, 2, 3, 4, 4, 5, 6};

        int tamanho = array.length;
        
        int resultado=0;
        
        resultado = removeDuplicados(array, tamanho);

        
        for (int i = 0; i < resultado; i++)
            System.out.print(array[i] + " ");
		
	}
	
	  public static int removeDuplicados(int array[], int tamanho)
	    {
	        int resultado = 0;
	        
	        for (int i = 0; i < tamanho - 1; i++) {
	            if (array[i] != array[i + 1]) {
	            	array[resultado++] = array[i];
	            }
	        }

	        array[resultado++] = array[tamanho - 1];

	        return resultado;
	    }
}
