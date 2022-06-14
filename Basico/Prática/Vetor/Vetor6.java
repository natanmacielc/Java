import java.util.Locale;
import java.util.Scanner;

import entity.Product;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o número de produtos:");
		int n = scanner.nextInt();
		Product[] vet = new Product[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.printf("Insira o nome do produto: ");
			String name = scanner.next();
			System.out.printf("Insira o preço do produto: ");
			double price = scanner.nextDouble();
			vet[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		
		for (int i=0; i<vet.length; i++) {
			sum += vet[i].getPrice();
		}
		double avg = sum / n;
		
		System.out.println("Average price: " + avg);
		
		scanner.close();

	}
}