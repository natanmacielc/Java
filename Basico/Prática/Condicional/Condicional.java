import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double horario = scanner.nextDouble();
		
		if (horario <= 12) {
			System.out.println("Bom Dia");
		}
		else if (horario <= 18 && horario > 12) {
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
		
		scanner.close();
		
	}

}
