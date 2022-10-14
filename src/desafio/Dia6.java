package desafio;

import java.util.Arrays;

public class Dia6 {
//17 - Escreva um programa Java para encontrar o segundo maior elemento em uma matriz.


	public static void main(String[] args) {

	    int array[] = { 100, 3504, 700, 1234, 10000};
	    
	    System.out.println("Array:" + Arrays.toString(array));

	    int tamanho = array.length;
	    
	    int v2;
	    
	    tamanho = tamanho - 1; 

	     
	    for (int i = 0; i <= tamanho; i++)
	    {
	        for (int j = 0; j <= (tamanho-1); j++)
	        {
	            if (array[j] > array[j+1])
	            {
	                v2 = array[j];
	                array[j] = array[j+1];
	                array[j+1] = v2;        
	            }      
	        }
	        
	     }
	   
	    System.out.println("O segundo maior valor é :" + array[tamanho-1]);
	  }
		
	}

