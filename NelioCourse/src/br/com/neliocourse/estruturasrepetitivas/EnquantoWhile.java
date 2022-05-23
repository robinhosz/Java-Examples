package br.com.neliocourse.estruturasrepetitivas;

import java.util.Scanner;

public class EnquantoWhile {

	public static void main(String[] args) {
		
		int num = 0;
		int soma = 0;
		
		int op = -1;
		while(op != 0) {
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		soma += num;
		System.out.println("\n Deseja continuar? 1 - sim 0 - não \n");
		op = sc.nextInt();
		
		}

		System.out.println("A soma dos números digitados foram: " + soma);
	}

}
