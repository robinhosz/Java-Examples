package br.com.neliocourse.vetores;

import java.util.Scanner;

public class VetoresReferenciaApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		int n = sc.nextInt();
		ProductVect[] vect = new ProductVect[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVect(name, price);
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;

		System.out.println("Media: " + avg);

	}

}
