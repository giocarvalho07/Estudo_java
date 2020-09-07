package vetor;

import java.util.Scanner;

public class VetorUnidimensaional {

	public static void main(String[] args) {
		
//		String[] cardapioPizza =  new String[] { "calabresa", "atum", "mossarela"};
//		
//		System.out.println("Cardáipo de pizzas :" );
//		
//		for(int contador = 0; contador < cardapioPizza.length; contador++) {
//			System.out.println(contador + " sabor: " + cardapioPizza[contador]);
//		}
//		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("digite o número referente ao sabor da pizza: ");
//		Integer saborEscolhido = scan.nextInt();
//		
//		System.out.println("Sabor escolhido : " + cardapioPizza[saborEscolhido]);
//		
//		scan.close();
		
		
//		String[] cardapioPizza =  new String[] { "calabresa", "atum", "mossarela"};
//		
//		cardapioPizza[1] = "frango";
//		
//		for(int contador = 0; contador < cardapioPizza.length; contador++) {
//			System.out.println(cardapioPizza[contador]);
//		}
		
		
		String[] cardapioPizza = new String[4];
		Scanner scan = new Scanner(System.in);
	
		for(int contador = 0; contador < cardapioPizza.length; contador++) {
			System.out.println("digite o sabor da pizza cardapio: ");
			cardapioPizza[contador] = scan.nextLine();
			System.out.println("sabor: " + cardapioPizza[contador] + " adicionado !");
		}
		
		
		for(int contador = 0; contador < cardapioPizza.length; contador++) {
			System.out.println("veja o cardápio completo: " + cardapioPizza[contador]);
		}

	}
}
