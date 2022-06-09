import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double numero = 1;
		double soma = 0;
		while(numero != 0) {
			numero = 0;
			numero = scanner.nextDouble();
			soma = soma + numero;
		}
		
		System.out.printf("O resultado da soma é: %.2f", soma);
		scanner.close();
		
	}

}
