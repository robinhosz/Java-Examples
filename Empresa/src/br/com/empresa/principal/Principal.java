package br.com.empresa.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.empresa.entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Emplyoee #" + (i + 1));
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Salario: ");
			Double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);

		}

		System.out.println("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		list.indexOf(id);
		
		for (Funcionario func : list) {
			System.out.println(func);
		}

	}
	
	public Integer hasId(List<Funcionario> list, Integer id) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			} 	
		}
		
		return null;
	}

}
