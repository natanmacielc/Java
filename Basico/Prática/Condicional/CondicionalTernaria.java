import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double preco = scanner.nextDouble();
		double desconto;
		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O desconto é: %.2f", desconto);
		
		scanner.close();
		
	}

}
