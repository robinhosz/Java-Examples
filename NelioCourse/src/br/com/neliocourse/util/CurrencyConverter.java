package br.com.neliocourse.util;

public class CurrencyConverter {

	public static double converter(double reais, double dollar) {
		double taxa = reais * dollar * 0.06;
		return reais * dollar + taxa; 
	}
}
