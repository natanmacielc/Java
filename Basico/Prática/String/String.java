public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG ";
		// Para transformar em minúsculo
		String s01 = original.toLowerCase();
		// Para transformar em maiúsculo
		String s02 = original.toUpperCase();
		// Para remover os espaços no final
		String s03 = original.trim();
		// Para recortar os caracteres, começando pelo terceiro(começa em 0)
		String s04 = original.substring(2);
		// Para recortar os caracteres, começando pelo terceiro e terminando no décimo
		String s05 = original.substring(2, 9);
		// Para substituir uma determinada cadeia de caracteres por outra
		String s06 = original.replace('a','x');
		// Para encontrar a primeira ocorrência de uma determinada cadeia da caracteres
		int i = original.indexOf("bc");
		// Para encontrar a última ocorrência de uma determinada cadeia de caracteres
		int j = original.lastIndexOf("bc");
		// Separa a cadeia de caracteres em vetores quando encontrar determinada ocorrência
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(i);
		System.out.println(j);
		System.out.println(s);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(vect[2]);

	}

}
