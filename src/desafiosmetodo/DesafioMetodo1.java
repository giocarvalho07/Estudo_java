package desafiosmetodo;

import java.util.Scanner;

public class DesafioMetodo1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		Double valorA = scan.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		Double valorB = scan.nextDouble();
		
		somar(valorA, valorB);
		
		
		scan.close();
	}
	
	public static void somar(Double a, Double b) {
		Double resultado = a + b;
		System.out.println("Soma: " + resultado);
	}

}
