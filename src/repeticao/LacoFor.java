package repeticao;

public class LacoFor {

	public static void main(String[] args) {
		
		Integer[] codigoProduto = new Integer[] {325, 78596, 85230};
		
		Double total = 0.0;
		
		for(int contador = 0; contador < codigoProduto.length; contador++ ) {
			Integer produto = codigoProduto[contador];
			total += codigoProduto[contador];
			System.out.println("produto " + contador + " do código: " + produto);
		}
		System.out.println(total);
	}
}
