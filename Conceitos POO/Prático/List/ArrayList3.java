import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entity.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Insira o número de funcionarios: ");
		Integer n = scanner.nextInt();
		List<Funcionario> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
			Integer id = i;
			System.out.printf("Insira o nome do funcionário: ");
			String name = scanner.next();
			System.out.printf("Insira o salário do funcionário: ");
			Double salario = scanner.nextDouble();
			Funcionario funcionario = new Funcionario(id, name, salario);
			list.add(funcionario);
			
		}
		
		System.out.printf("Insira o id do funcionário: ");
		Integer id = scanner.nextInt();
		System.out.println("Insira a porcentagem de aumento do salário do funcionário: ");
		Double porcentagem = scanner.nextDouble();
		
		List<Funcionario> result = list.stream().filter(x -> x.getId() == id).collect(Collectors.toList());
		
		if(result != null) {
			result.get(0).setSalario(result.get(0).getSalario() * (porcentagem/100 + 1));
		} else {
			System.out.println("O id informado não existe.");
			System.exit(0);
		}
		System.out.println("Lista de funcionários:");
		for (Funcionario x : list) {
			System.out.printf("Id: %d, Nome: %s, Salario: %.2f | ", x.getId(), x.getName(), x.getSalario());
		}
		
		scanner.close();

	}
}