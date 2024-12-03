package br.com.crud.modulos;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.crud.model.Motorista;

public class ModuloMotorista {
	private ArrayList<Motorista> motoristas;
	private Scanner scanner;
	
	public ModuloMotorista() {
		this.motoristas = new ArrayList<Motorista>();
		this.scanner = new Scanner(System.in);
	}

	private  void menuMotoritas() {
		System.out.println("------menuMotoritas------");
		System.out.println("1- Cadastrar Motoristas");
		System.out.println("2- Buscar por CPF"); 
		System.out.println("3- Listar todos"); 
		System.out.println("0- SAIR DO Menu de Motorista\n\n");
	}
	
	public void iniciar() {
		String op = null;
		do {
			this.menuMotoritas();
			op = this.scanner.nextLine();
			switch (op) {
			case "1": {
				this.cadastrarMotorista();
				break;
			}
			case "2": {
				this.buscarPorCpf();
				break;
			}
			case "3": {
				this.listaMotoristas();
				break;
			}
			case "4": {
				System.out.println("SAindo do menu de Motoristas");
			}
			default:
				System.out.println("Opção Inválida");
			}
			
		}while(!op.equals("0"));

		
		
	}

	private void buscarPorCpf() {
		System.out.print("Informe o cpf: ");
		String cpf = this.scanner.nextLine();
		Motorista motorista = this.buscarMotorista(cpf);
		if(motorista!=null) {
			System.out.println(motorista);
			return;
		}
		System.out.println("Não encontrado");
		
	}
	
	private void cadastrarMotorista() {

		System.out.print("Informe o cpf: ");
		String cpf = this.scanner.nextLine();
		Motorista motorista = this.buscarMotorista(cpf);
		if(motorista == null) {
			System.out.print("Informe o nome: ");
			String nome = this.scanner.nextLine();
			this.addMotorista(nome, cpf);
			return;
		}
		System.out.println("Já existe um motorista com esse CPF. :)");
	}
	
	
	private void addMotorista(String nome, String cpf) {
		this.motoristas.add(new Motorista(nome, cpf));
	}
	
	public Motorista buscarMotorista(String cpf) {
		for(Motorista motorista: this.motoristas) {
			if(motorista.getCpf().equals(cpf)) {
				return motorista;
			}
			
		}
		return null;
	}
	
	private void listaMotoristas() {
		for(Motorista motorista: this.motoristas) {
			System.out.println(motorista);
		}
		
	}
}
