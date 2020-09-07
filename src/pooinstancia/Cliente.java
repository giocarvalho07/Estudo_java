package pooinstancia;

public class Cliente {
	
	String nome;
	String sobrenome;
	String telefone;
	String email;
	
	
	String obterNomeCompleto() {
		String nomeCompleto = nome + " " + sobrenome;
			return nomeCompleto;
	}

}
