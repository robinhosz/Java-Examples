package br.com.neliocourse.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.neliocourse.entities.Order;
import br.com.neliocourse.entities.Product;

public class App {

	public static void main(String[] args) {
		Integer opcao = -1;
		
		List<Product> list = new ArrayList<Product>();
		while (opcao != 0) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o nome: ");
			String nome = sc.next();
			
			System.out.println("Digite o preço: ");
			Double preco = sc.nextDouble();
			
			System.out.println("Digite a quantidade: ");
			int quantidade = sc.nextInt();
			
			
			System.out.println("Quer sair? Digite 0 ");
			opcao = sc.nextInt();
			
			Product product = new Product(nome, preco, quantidade);
			list.add(product);
			
		}

		
		for(Product listinha : list) {
			System.out.println(listinha);
		}

		

	}

}
