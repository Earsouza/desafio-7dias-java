package desafio;

public class Dia2 {
	
	public static void main(String[] args) {
		String a[][] = new String[10][10];
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.printf(" - ", a[i][j]);
			}
			System.out.println();
		}
	}
}
