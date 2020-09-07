package decisao;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o peso: ");
		Double peso = scan.nextDouble();
		
		Boolean semCategoria = peso <=55;
		Boolean pesoLeve = peso <= 60;
		Boolean pesoMedio = peso >= 60 && peso <= 90;
		Boolean pesoPesado = peso >= 90 && peso <= 120;
		
		if(pesoLeve) {
			System.out.println("lutador peso leve");
		}
		else if(pesoMedio) {
			System.out.println("lutador peso medio");
		}
		else if(pesoPesado) {
			System.out.println("lutador peso pesado");
		}
		else {
			System.out.println("lutador sem categoria");
		}
		
		scan.close();
	}
}
