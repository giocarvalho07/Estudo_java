package decisao;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
	
		System.out.print("digite o mês da viagem: ");
		Integer mesViagem = scan.nextInt();
		
		Double desconto = 0.0;
		
		switch (mesViagem) {
		case 1: desconto = 0.0;
			break;
		case 2: desconto = 0.0;
			break;
		case 3: desconto = 15.0;
			break;
		case 4: desconto = 30.0;
			break;
		case 5: desconto = 30.0;
			break;
		case 6: desconto = 10.0;
			break;
		case 7: desconto = 10.0;
			break;
		case 8: desconto = 10.0;
			break;
		case 9: desconto = 10.0;
			break;
		case 10: desconto = 20.0;
			break;
		case 11: desconto = 10.0;
			break;
		case 12: desconto = 0.0;
			break;
		default: 
			System.err.println("Digite um mês válido!");
			System.exit(1);
		}
		
		System.out.println("seu desconto será de: " + desconto + " %");
		
		scan.close();
	}
}
