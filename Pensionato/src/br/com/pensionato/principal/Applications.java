package br.com.pensionato.principal;

import java.util.Scanner;

import br.com.pensionato.entities.Estudantes;
import br.com.pensionato.entities.Quartos;

public class Applications {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Quartos[] quarto = new Quartos[10];

		System.out.print("How many rooms will be rented? ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Rent #" + i);
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			int room = sc.nextInt();

			quarto[room] = new Quartos(nome, email);

		}
		System.out.println("Busy rooms: ");
		for (int i = 0; i < quarto.length; i++) {
			if (quarto[i] != null) {

				System.out.println(i + ": " +quarto[i]);
			}
		}

		sc.close();
	}

}
