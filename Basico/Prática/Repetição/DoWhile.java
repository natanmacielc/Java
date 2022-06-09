import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double celsius = 0.0;
		double fahrenheit = 0.0;
		String simNao = null;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = scanner.nextDouble();
			fahrenheit = celsius * 1.8 + 32;
			System.out.println("Equivalente em Fahrenheit: " + fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			simNao = scanner.next();
		} while (simNao.equals("s"));

		scanner.close();

	}

}
