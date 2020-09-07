package desafioestoque;

public class PrincipalDesafio {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.nome = "galaxy j5";
		produto.preco = 550.00;
		produto.quantidadeProduto = 2;
		produto.quantidadeEstoque = true;
		
		
		produto.quantidadeEstoque();
		
	}
}
