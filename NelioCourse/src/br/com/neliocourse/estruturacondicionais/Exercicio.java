package br.com.neliocourse.estruturacondicionais;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double pb = 50;
		double mc;
		
		System.out.println("Quantos minutos você consumiu? ");
		mc = sc.nextDouble();
		
		if (mc > 100) {
			pb += (mc - 100) * 2.0;
			System.out.println("O valor a ser pago é: R$ " + pb);
		} else {
			System.out.println("O valor a ser pago é: R$ " + pb);
		}
		
		sc.close();
	}

}
