package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Enter rental data");
		System.out.println("Car model: ");
		String carModel = sc.nextLine();
		System.out.println("Pickup: ");
		Date start = sdf.parse(sc.nextLine());
		System.out.println("Return: ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.println("Enter price per hour");
		double pricePerHour = sc.nextDouble();
		System.out.println("Enter price per day: ");
		double pricePerDay = sc.nextDouble();

		RentalService rentalService = new RentalService(pricePerDay, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("INVOICE: ");
		System.out.println("Basic payment: " + cr.getInvoice().getBasicPayment());
		System.out.println("Tax: " + cr.getInvoice().getTax());
		System.out.println("Total payment: " + cr.getInvoice().getTotalPayment());

		sc.close();
	}

}
