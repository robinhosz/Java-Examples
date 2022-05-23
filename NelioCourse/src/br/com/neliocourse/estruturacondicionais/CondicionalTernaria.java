package br.com.neliocourse.estruturacondicionais;

public class CondicionalTernaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		
		double preco2 = 34.5;
		
		double desconto2 = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto2);
	}

}
