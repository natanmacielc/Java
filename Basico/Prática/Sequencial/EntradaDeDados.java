import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String x;
		x = scanner.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = scanner.nextInt();
		System.out.println("Você digitou: " + y);
		
		double z;
		z = scanner.nextDouble();
		System.out.println("Você digitou:" + z);
		
		char a;
		a = scanner.next().charAt(0);
		System.out.println("Você digitou:" + a);
		
		String s1, s2, s3;
		
		s1 = scanner.nextLine();
		s2 = scanner.nextLine();
		s3 = scanner.nextLine();
		
		System.out.println("DADOS DIGITADO:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		scanner.close();
		
	}

}
