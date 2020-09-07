package desafiospoo;

public class ProdutoSobrancelha {
		
	String nome;
	String descricao;
	Double preco;
	Double desconto;
	
	void exibirDesconto() {
		Double resultadoDesconto = preco - desconto;
		System.out.println("O produto: " + nome + 
				" está na promoção, com o preco de R$ "
				+ resultadoDesconto );
	}
	
	String obterDescricao() {
		String resultadoDescricao = "Descrição: " + descricao;
		return resultadoDescricao;
	}


}
