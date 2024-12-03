package br.com.crud.principal;

import java.util.Scanner;

import br.com.crud.modulos.ModuloMotorista;
import br.com.crud.modulos.ModuloVeiculo;

public class Sistema {
	
	private ModuloMotorista moduloMotorista;
	private ModuloVeiculo moduloVeiculo;

	
	
	public Sistema() {
		this.moduloMotorista = new ModuloMotorista();
		this.moduloVeiculo = new ModuloVeiculo(this.moduloMotorista);
	}




	public  void menuPrincipal() {
		System.out.println("---------PRINCIPAL--------");
		System.out.println("1 - Menu de Motoristas");
		System.out.println("2 - Menu de Veiculos");
		System.out.println("3 - Menu de Abastecimento");
		System.out.println("3 - Sair do Sistema");
		
	}
	

	
	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			menuPrincipal();
			String op = scanner.nextLine();
			if(op.equals("1")) {
				this.moduloMotorista.iniciar();
			}
			else if(op.equals("2")) {
				this.moduloVeiculo.iniciar();
			}
			else if(op.equals("3")) {
				System.out.println("Saindo do sistema");
				break;
			}
			else {
				System.out.println("OPÇÃO iNVÁLIDA");
			}

		}
		
		scanner.close();
	}

}
