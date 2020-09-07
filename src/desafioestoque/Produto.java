package desafioestoque;

public class Produto {
	
	static final Integer ESTOQUEPRODUTO = 10;
	
	String nome;
	
	Double preco;
	
	Integer quantidadeProduto;
	
	Boolean quantidadeEstoque;
	
	
	Boolean quantidadeEstoque() {
		
		Boolean resultadoDoEstoque = quantidadeEstoque;
		
		if(quantidadeProduto >= ESTOQUEPRODUTO) {
			System.out.println(nome + " em estoque ! ");
		}
		else {
			System.out.println(nome + " abaixo de " + ESTOQUEPRODUTO + " unidade(s)");
			System.out.println("Favor repor o estoque !");
		}
		
		return resultadoDoEstoque;
		
	}
}
