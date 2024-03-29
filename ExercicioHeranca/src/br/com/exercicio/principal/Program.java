package br.com.exercicio.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.exercicio.entities.Employee;
import br.com.exercicio.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int opcao = sc.nextInt();

		for (int i = 1; i <= opcao; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.println("Outsourced (y/n)? ");
			char op = sc.next().charAt(0);

			System.out.print("Name: \n");
			String name = sc.next();
			System.out.print("Hours: \n");
			int hours = sc.nextInt();
			System.out.print("Value per hour: \n");
			double valuePerHour = sc.nextDouble();
			
			if (op == 'y') {
				System.out.print("Additional charge:");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}

		}
		System.out.println();
		System.out.println("PAYMENTS: ");

		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}

}
