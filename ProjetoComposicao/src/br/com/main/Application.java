package br.com.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.entities.Departament;
import br.com.entities.HourContract;
import br.com.entities.Worker;
import br.com.enums.WorkerLevel;

public class Application {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("\n Enter department's name: \n");
		String departament = sc.next();
		System.out.println("Enter worker data: ");
		System.out.print("\n Name: \n");
		String name = sc.next();
		System.out.print("\n Level: \n");
		String level = sc.next();
		System.out.print("\n Base Salary: \n");
		Double baseSalary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Departament(departament));

		System.out.print("\n How many contracts to this worker? \n");
		int num = sc.nextInt();

		for (int x = 1; x <= num; x++) {
			System.out.println("Enter contract #" + x + " data:");
			System.out.print("\n Date (DD/MM/YYYY): \n ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("\n Value per hour: \n ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("\n Duration (hours): \n ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.print("\n Enter month and year to calculate income (MM/YYYY): \n");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
	}

}