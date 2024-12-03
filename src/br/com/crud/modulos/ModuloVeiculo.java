package br.com.crud.modulos;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.crud.model.Motorista;
import br.com.crud.model.Veiculo;
import br.com.crud.modulos.ModuloMotorista;
import br.com.crud.principal.Sistema;

public class ModuloVeiculo {
	private ArrayList<Veiculo> veiculos;
	private Scanner scanner;
	private ModuloMotorista moduloMotorista;

	public ModuloVeiculo(ModuloMotorista moduloMotorista) {
		this.scanner = new Scanner(System.in);
		this.veiculos = new ArrayList<Veiculo>();
		this.moduloMotorista = moduloMotorista;
	}

	public void iniciar() {

		String op;
		do {
			this.menuVeiculos();
			op = this.scanner.nextLine();
			switch (op) {
			case "1": {
				this.cadastrarVeiculo();
				break;
			}
			case "2": {
				this.buscarPorPlaca();
				break;
			}
			case "3": {
				this.listarTodosVeic();
				break;
			}
			case "4": {
				this.vincularMotorista();
				break;
			}
			case "5": {
				this.listarVeicPorCpf();
				break;
			}
			default:
				System.out.println("Opção inválida");
			}

		} while (!op.equals("0"));

	}
	
	private void vincularMotorista() {
		Veiculo veiculo = this.buscarPorPlaca();
		
		System.out.print("Digite o CPF do motorista: ");
		String cpf = scanner.nextLine();
		Motorista motorista = this.moduloMotorista.buscarMotorista(cpf);
		if(motorista != null) {
			veiculo.setMotorista(motorista);
			System.out.printf(motorista.getNome() + " cadastrado ao veículo de placa " + veiculo.getPlaca() + "\n");
		}
		else if (motorista == null) {
			System.out.println("Motorista não existe!");
		}
	}
	
	private Veiculo buscarPorPlaca() {
		System.out.print("Informe o placa: ");
		String placa = this.scanner.nextLine();
		Veiculo veiculo = this.buscarVeiculo(placa);
		if(veiculo != null) {
			System.out.println(veiculo);
			return veiculo;
		}
		System.out.println("Não encontrado");
		return null;
	}
	
	private void cadastrarVeiculo() {
		System.out.print("Informe o placa: ");
		String placa = this.scanner.nextLine();
		Veiculo veiculo = this.buscarVeiculo(placa);
		if(veiculo == null) {
			System.out.print("Informe o modelo: ");
			String modelo = this.scanner.nextLine();
			System.out.print("Informe o tanque: ");
			int tanque= this.scanner.nextInt();
			this.scanner.nextLine();
			this.addVeiculo(placa, modelo, tanque);
			return;
		}
		System.out.println("Já existe um veiculo com ass PLACA. :)");
	
	}
	private Veiculo buscarVeiculo(String placa) {
		for(Veiculo veiculo: this.veiculos) {
			if(veiculo.getPlaca().equalsIgnoreCase(placa)) {
				return veiculo;
			}
			
		}
		return null;
	}
	
	private void addVeiculo(String placa, String modelo, int tanque) {
		this.veiculos.add(new Veiculo(placa, modelo, tanque));
	}
	
	private void listarTodosVeic() {
		for(Veiculo veiculo: veiculos) {
			System.out.println(veiculo);
		}
	}
	
	private void listarVeicPorCpf() {
		System.out.println("Digite o cpf: ");
		String cpf = scanner.nextLine();
		
		for(Veiculo veiculo: veiculos) {
			Motorista motorista = veiculo.getMotorista();
			if (motorista != null && motorista.getCpf().equals(cpf)) {
				System.out.println(veiculo);
			}
		}
	}
	
	private void menuVeiculos() {
		System.out.println("------menu= de Veículo------");
		System.out.println("1- Cadastrar Veiculo");
		System.out.println("2- Buscar por placa");
		System.out.println("3- Listar todos os veiculos");
		System.out.println("4- Atribuir um motorista a um veiculo"); // pela placa,se existir, atribuir
		System.out.println("5- Listar Veiculos por CPF do motorista");
		System.out.println("6- Listar Todos os veiculos que tem capacidade de tanque maior que 50");
		System.out.println("0- SAIR DO Menu de Motorista\n\n");

	}
}
