package poo;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.nome = "celular j5";
		produto.preço = 450.00;
		produto.quantidade = 25;
		
		exibirQuantidadeEstoque(produto);

	}
	
	static void exibirQuantidadeEstoque(Produto quantidadeEstoqueProduto) {
		System.out.println("O produto " + quantidadeEstoqueProduto.nome + " tem " 
				+ quantidadeEstoqueProduto.quantidade + " unidade(s) em estoque");
	}
	
}
