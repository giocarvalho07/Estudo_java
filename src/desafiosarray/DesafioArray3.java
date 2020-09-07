package desafiosarray;

public class DesafioArray3 {

	public static void main(String[] args) {
		
		
		Double[] carrinhoCompras = new Double[] {40.0, 50.0, 60.0};
		Double total = 0.0;
		
		for(Double carrinho: carrinhoCompras) {
			total += carrinho;
			System.out.println("Produto: " + carrinho + " | Subtotal: " + (total));;
		}
		
		System.out.println("Total de produtos no carrinho: " + total);
		
	}
	
}


