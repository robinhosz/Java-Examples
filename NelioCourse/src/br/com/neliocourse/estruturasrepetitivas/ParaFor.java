package br.com.neliocourse.estruturasrepetitivas;

import java.util.Scanner;

public class ParaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		int soma = 0;
		for(int i = 0; i < N; N++) {
			int n = sc.nextInt();
			soma += n;
			
		}
		System.out.println(soma);
		
		
		
	}

}
