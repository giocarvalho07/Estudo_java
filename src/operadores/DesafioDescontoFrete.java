package operadores;

import java.util.Scanner;

public class DesafioDescontoFrete {

	static final Integer FRETE_PRODUTO = 15;
	static final Integer DESCONTO_FRETE = 100;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o nome do produto escolhido: ");
		String nomeProduto = scan.nextLine();
		
		System.out.print("digite o preco do produto: ");
		Double precoProduto = scan.nextDouble();
		
		Boolean precoParcial = precoProduto.equals(DESCONTO_FRETE);
		
		if(precoParcial){
			System.out.println("o produto n�o ter� frete "+ precoProduto);
		}
		else {
			Double totalCompra = precoProduto +  FRETE_PRODUTO;
			System.out.println("o produto ter� acr�scimo de frete, valor final: " + totalCompra);
		}
		scan.close();
	}
}