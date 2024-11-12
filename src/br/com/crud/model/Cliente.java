package br.com.crud.model;

public class Cliente {
	private String nome;
	private int cpf;
	
	public Cliente(String nome, int cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}

	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCPF() {
		return this.cpf;
	}
	
	public void setCPF(int cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		
		return "Nome: " + this.nome + 
				" CPF: "+ this.cpf;
	}
}
