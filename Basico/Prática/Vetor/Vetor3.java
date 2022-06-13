public class Main {

	public static void main(String[] args) {

		String nome[] = {"Juca Bala", "Maria da Silva", "Marcos Paqueta"};
		
		int i, n = nome.length;
		
		for (i=0; i<n; i++) {
			System.out.printf("%do. nome = %s\n", (i+1), nome[i]);
		}
		
	}

}
