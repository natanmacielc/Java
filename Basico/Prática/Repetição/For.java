import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		int numero = scanner.nextInt();
		for (int i = 0; i != numero; i++) {
			int novoNumero = scanner.nextInt();
			soma = soma + novoNumero;
		}
		
		System.out.println("O resultado é: " + soma);
		scanner.close();
		
	}

}
