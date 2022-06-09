import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int dia = scanner.nextInt();
		String resultado;
		
		switch (dia) {
		case 1: {
			resultado = "domingo";
			break;
		}
		case 2: {
			resultado = "segunda";
			break;
		}
		case 3: {
			resultado = "terça";
			break;
		}
		case 4: {
			resultado = "quarta";
			break;
		}
		case 5: {
			resultado = "quinta";
			break;
		}
		case 6: {
			resultado = "sexta";
			break;
		}
		case 7: {
			resultado = "sábado";
			break;
		}
		default:
			resultado = "valor inválido";
			break;
		}
		
		System.out.println("Dia da semana:" + resultado);
		
		scanner.close();
		
	}

}
