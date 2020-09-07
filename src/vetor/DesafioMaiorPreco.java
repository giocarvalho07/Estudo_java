package vetor;

public class DesafioMaiorPreco {

	public static void main(String[] args) {

		Double[] carrinhoComprasUm = new Double[]{ 29.90, 15.82, 123.09};
		Double[] carrinhoComprasDois = new Double[]{ 22.08, 258.99, 81.70};
		Double[] carrinhoComprasTres = new Double[]{ 139.40, 25.60, 96.85};
		
		Double[][] mesCompras = new Double[][] {carrinhoComprasUm, carrinhoComprasDois, carrinhoComprasTres};
		
		Double maiorPrecoCarrinhoCompra = 0.0;
		Integer numeroCarrinhoMaisCaro = 0;
		
		for(int contador = 0; contador < mesCompras.length; contador++) {
			Double[] mes = mesCompras[contador];
			System.out.println(" Carrinho de compra n º: " + (contador + 1));
			
			Double total = 0.0;
			
			for(int contadora = 0; contadora < mes.length; contadora++) {
				total += mes[contadora];
				System.out.println("preco do " + (contadora + 1) + " º produto: " + mes[contadora]);
				
				if(total > maiorPrecoCarrinhoCompra) {
					maiorPrecoCarrinhoCompra = total;
					numeroCarrinhoMaisCaro = contador + 1;
				}
				
			}
			
			System.out.println("Soma do " + (contador + 1) + " º carrinho de compra " + total);
			System.out.println("================================");
		}
	
		
		
		System.out.println("O maior carrinho de compra é: " + numeroCarrinhoMaisCaro + " º com o total de R$: " + maiorPrecoCarrinhoCompra) ;
		
		
		
	}
}
