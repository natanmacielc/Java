import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.printf("Insira a quantidade de linhas da matriz: ");
		int m = scanner.nextInt();
		System.out.println("Insira a quantidade de colunas da matriz: ");
		int n = scanner.nextInt();

		int mat[][] = new int[m][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Insira um número na coluna %d e linha %d: ", i, j);
				mat[i][j] = scanner.nextInt();
			}
		}
		
		System.out.printf("Insira um número referência: ");
		int x = scanner.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] == x) {
					System.out.printf("Posição: %d, %d", i, j);
					System.out.println();
					if (j-1 >= 0) {
					System.out.println("Left: " + mat[i][j-1]);
					}
					if (j+1 >= 0) {
					System.out.println("Right: " + mat[i][j+1]);
					}
					if (i+1 >= 0) {
					System.out.println("Down: " + mat[i+1][j]);
					}
					if (i-1 >= 0) {
					System.out.println("Up: " + mat[i-1][j]);
					}
				}
			}
		}

		System.out.println("Matriz impressa:");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
		scanner.close();

	}
}