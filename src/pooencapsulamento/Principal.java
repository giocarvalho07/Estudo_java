package pooencapsulamento;

public class Principal {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		cliente.setNome("João de Deus");
		cliente.setTelefone("11985632145");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		
	}
}
