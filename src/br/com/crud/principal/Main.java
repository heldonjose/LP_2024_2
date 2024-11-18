package br.com.crud.principal;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.crud.model.Veiculo;

import br.com.crud.model.Motorista;

public class Main {
	static ArrayList<Veiculo> veiculos = new ArrayList<>();
	static ArrayList<Motorista> motoristas= new ArrayList<>();
	
	

	public static void main(String[] args) {
		iniciarSistema();
		
	}

	public static void menuPrincipal() {
		System.out.println("---------PRINCIPAL--------");
		System.out.println("1 - Menu de Motoristas");
		System.out.println("2 - Menu de Veiculos");
		System.out.println("3 - Sair do Sistema");
		
	}
	
	public static void menuMotoritas() {
		System.out.println("------menuMotoritas------");
		System.out.println("1- Cadastrar Motoristas"); //Informar o nome e CPF, cpf sendo único
		System.out.println("2- Buscar por CPF"); 
		System.out.println("3- SAIR DO Menu de Motorista\n\n");
		
		
	}
	
	public static void menuVeiculos() {;
		System.out.println("------menuMotoritas------");
		System.out.println("1- Cadastrar Veiculo"); //Informar  placa,  modelo e capacidadeTanque, 
		System.out.println("2- Buscar por placa"); //Informar a placa
		System.out.println("3- Listar todos os veiculos"); //IMprimir a placa e modelo
		System.out.println("4- Atribuir um motorista a um veiculo"); //Buscar o motorista pelo cpf, se existir, atribuir
		System.out.println("5- Listar Veiculos por CPF do motorista"); //IMprimir a placa e modelo
		System.out.println("6- Listar Todos os veiculos que tem capacidade de tanque maior que 50"); 
		System.out.println("7- SAIR DO Menu de Motorista\n\n"); //Informar o nome e CPF
		
		
		
	}
	public static void iniciarSistema() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			menuPrincipal();
			String op = scanner.nextLine();
			if(op.equals("1")) {
				menuMotoritas();
			}
			else if(op.equals("2")) {
				menuVeiculos();
			}
			else if(op.equals("3")) {
				System.out.println("Saindo do sistema");
				break;
			}
			else {
				System.out.println("OPÇÃO iNVÁLIDA");
			}

		}
		
		
		
	}
}
