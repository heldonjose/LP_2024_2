package br.com.crud.model;

public class Motorista {
	private String nome;
	private String cpf;
	
	public Motorista(String nome, String cpf) {

		this.nome = nome;
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "Motorista [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	

}
