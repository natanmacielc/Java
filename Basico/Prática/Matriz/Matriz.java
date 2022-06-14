import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Insira as dimensões da matriz: ");
		int n = scanner.nextInt();
		int m[][] = new int[n][n];
		
		for (int i=0; i<m.length; i++ ) {
			for (int j=0; j<m[i].length; j++) {
				System.out.printf("Insira um número na coluna %d e linha %d: ", i, j);
				m[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Principal diagonal:");
		
		for (int i=0; i<m.length; i++) {
			System.out.println(m[i][i]);
		}
		
		System.out.println("Números negativos:");
		
        int count = 0;

		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				if (m[i][j] < 0) {
					System.out.println(m[i][j]);
                    count++;
				}
			}
		}
        
        System.out.println("Números negativos:" + count);
		
		System.out.println("Matriz impressa:");
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.printf("%d ", m[i][j]);
			}
			System.out.println();
		}
		
		scanner.close();

	}
}