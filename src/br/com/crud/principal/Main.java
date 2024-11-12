package br.com.crud.principal;
import br.com.crud.model.Cliente;
import br.com.crud.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando sistema");
		
		Cliente cliente1 = new Cliente("Heldon", 050);
		Cliente cliente2 = new Cliente("Joao", 040);
		Cliente cliente3 = cliente2; 
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		
		String teste = cliente1.getNome();
		
		System.out.println(teste);
		cliente1.setNome("Heldon José");
		
		System.out.println(teste);
		teste = cliente1.getNome();
		
		System.out.println(teste);
		
		cliente2.setNome("João Carlos");
		System.out.println(cliente3.getNome());
		
		Veiculo veiculo1 = new Veiculo("ABC1234", "Siena", 55);
		Veiculo veiculo2 = new Veiculo("DEF1234", "Siena", 55);
		Veiculo veiculo3 = new Veiculo("GHI1234", "Siena", 55);
		
	}
	
}
