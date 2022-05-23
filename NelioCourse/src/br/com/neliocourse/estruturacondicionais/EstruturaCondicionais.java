package br.com.neliocourse.estruturacondicionais;

import java.util.Scanner;

//Estrutura Condicionais IF-ELSE

public class EstruturaCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 5;
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if (hora < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");
			}
		}

		// Ou pode ser feito dessa forma com ELSE IF

		if (hora < 12) {
			System.out.println("Bom Dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();

	}

}
