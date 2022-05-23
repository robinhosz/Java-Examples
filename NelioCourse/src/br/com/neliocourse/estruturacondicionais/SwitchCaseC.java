package br.com.neliocourse.estruturacondicionais;

import java.util.Scanner;

public class SwitchCaseC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Digite um número inteiro de 1 a 7: ");
		num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("Dia da semana: domingo");
			break;
		case 2:
			System.out.println("Dia da semana: segunda");
			break;
		case 3:
			System.out.println("Dia da semana: terça");
			break;
		case 4:
			System.out.println("Dia da semana: quarta");
			break;
		case 5:
			System.out.println("Dia da semana: quinta");
			break;
		case 6:
			System.out.println("Dia da semana: sexta");
			break;
		case 7:
			System.out.println("Dia da semana: sabado");
			break;
		default:
			System.err.println("Valor invalido");

		}

	}

}
