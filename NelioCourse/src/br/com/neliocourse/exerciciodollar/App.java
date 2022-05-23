package br.com.neliocourse.exerciciodollar;

import java.util.Scanner;

import br.com.neliocourse.util.CurrencyConverter;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price? ");
		double reais = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollar = sc.nextDouble();

		System.out.println("Amount to be paid in reais = " + CurrencyConverter.converter(reais, dollar));

	}

}
