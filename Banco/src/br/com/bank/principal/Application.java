package br.com.bank.principal;

import java.util.Scanner;

import br.com.bank.entities.Banco;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo = 0.0;

		System.out.println("Enter account number: ");
		int nmConta = sc.nextInt();
		System.out.println("Enter account holder: ");
		String name = sc.next();
		System.out.println("Is there na initial deposit (y/n) ?");
		String opcao = sc.next();

		if (opcao.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			saldo = sc.nextDouble();
		} else if (opcao.equals("n")) {
			saldo = 0.0;
		}

		Banco banco = new Banco(name, nmConta, saldo);
		
		System.out.println("Account data:");
		System.out.println(banco);

		System.out.println("Enter a deposit value: ");
		saldo = sc.nextDouble();

		System.out.println("Updated account data:");
		banco.deposit(saldo);
		System.out.println(banco);

		System.out.println("Enter a withdraw value: ");
		saldo = sc.nextDouble();

		System.out.println("Updated account data:");
		banco.withdraw(saldo);
		System.out.println(banco);

	}

}
