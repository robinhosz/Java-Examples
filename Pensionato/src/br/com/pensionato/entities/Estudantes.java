package br.com.pensionato.entities;

public class Estudantes {

	private String nome;
	private String email; 
	private Quartos quarto;

	public Estudantes(String nome, String email, Quartos quarto) {
		super();
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Quartos getQuarto() {
		return quarto;
	}

	public void setQuarto(Quartos quarto) {
		this.quarto = quarto;
	}

}
