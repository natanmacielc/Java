import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<80000000; i++) {
			list.add(i);
		}
		
		for (Integer x : list) {
			System.out.println(x);
		}
		

	}
}