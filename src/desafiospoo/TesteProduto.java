package desafiospoo;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutoSobrancelha produto = new ProdutoSobrancelha();
		
		produto.nome = "Micropigmentação - Fio a Fio";
		produto.descricao = "Micro feita com produtos de qualidade";
		produto.preco = 499.99;
		produto.desconto = 29.99;
		
		
		System.out.println(produto.nome);
		produto.exibirDesconto();
		
		String resultadoDescricao = produto.obterDescricao();
		System.out.println(resultadoDescricao);
	}
	
	

}
