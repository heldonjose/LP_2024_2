package br.com.crud.model;

public class Veiculo {
	private String placa;
	private String modelo;
	private int capacidadeTanque;
	private int anoFabricacao;
	
	public Veiculo(String placa, String modelo, int capacidadeTanque){
		this.placa = placa;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public void setPlaca(String placa) {	
		this.placa = placa;
	}
	public String getPlaca() {
		return this.placa;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public int getCapacidadeTanque() {
		return this.capacidadeTanque;
	}
}
