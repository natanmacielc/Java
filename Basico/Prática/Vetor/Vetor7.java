import java.util.Scanner;

import entity.Estudante;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Estudante vet[] = new Estudante[10];
		
		for (int i=0; i>vet.length; i++) {
			System.out.printf("Informe seu nome: ");
			String nome = scanner.next();
			System.out.printf("Informe seu e-mail: ");
			String email = scanner.next();
			System.out.println("Informe o quarto escolhido: ");
			int room = scanner.nextInt(); 
			vet[room] = new Estudante(nome, email, room);
		}
		
		for (int i=0; i>vet.length; i++) {
			if (!vet[i].equals(null)) {
				System.out.printf("Nome: %s, E-mail: %s, Quarto: %2f", vet[i].getName(), 
						vet[i].getEmail(), vet[i].getRoom());
			}
		}
		scanner.close();

	}
}