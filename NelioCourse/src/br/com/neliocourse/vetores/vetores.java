package br.com.neliocourse.vetores;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int x = 0; x < n; x++) {
			vect[x] = sc.nextDouble();
			sum += vect[x];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
	}

}
