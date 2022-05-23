package br.com.bank.entities;

public class Banco {

	private String name;
	private int nmConta;
	private double saldo;

	public Banco() {

	}

	public Banco(String name, int nmConta, double saldo) {
		this.name = name;
		this.nmConta = nmConta;
		this.saldo = saldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNmConta() {
		return nmConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String toString() {
		return "Account: " + nmConta + ", Holder: " + name + ", Balance: " + saldo;
	}

	public void deposit(double saldo) {
		this.saldo += saldo;
		
	}

	public void withdraw(double saldo) {
		this.saldo -= saldo + 5;
		
		
	}
}
