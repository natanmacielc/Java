public class Main {

	public static void main(String[] args) {

		int n = 10, x;
		int original [] = new int[n]; // serão mantidos os dados originais de entrada
		int a[] = new int[n];
		for (int i=0; i<n; i++) {
			x = (int)Math.round(Math.random() * 100); // o resultado dessa expressão
			original[i] = x;						  // aleatório no intervalo de o até 100	
			a[i] = x;
		}
		// Ordena os elementos do vetor: Selection Sort.
		int i, j, menor, aux;
		for (i=0; i<(n-1); i++) {
		// seleciona a posição do i-ésuno menor elemento
			menor = i;
			for (j=(i+1); j<n; j++) {
				if (a[j] < a[menor])
					menor = j;
			}
		// swap: troca o elemento da posição "i"
		//		 com o elemento da posição "menor"
			
			aux = a[i];
			a[i] = a[menor];
			a[menor] = aux;
		}
		System.out.println("v[i] = Original, Ordenado");
		System.out.println("--------------------------");
		for (i=0; i<n; i++) {
			System.out.printf("v[%d] = %8d, %8d\n", i, original[i], a[i]);
		}
		
	}

}
