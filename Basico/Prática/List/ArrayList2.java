import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Natan");
		list.add("Maciel");
		list.add("Cavalcanti");
		
		list.removeIf(x -> x.charAt(0) == 'N');

        System.out.println("Index of Maciel : " + list.indexOf("Maciel"));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		
		for (String x : list) {
			System.out.println(x);
		}

        System.out.println(result);
        String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(name);
		

	}
}