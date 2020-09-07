package pooinstancia;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Alexandre";
		cliente.sobrenome = "Afonso";
		cliente.telefone = "11965653232";
		cliente.email = "alexandre@algaworks.com";
		
		System.out.println("nome do cliente: " + cliente.obterNomeCompleto());
		

	}

}
