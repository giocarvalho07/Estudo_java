package operadores;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o primeiro n�mero: ");
		Double numberOne = scan.nextDouble();
		
		System.out.println("digite a opera��o desejada: ");
		System.out.println("1 - para adi��o");
		System.out.println("2 - para subtra��o");
		System.out.println("3 - para multiplica��o");
		System.out.println("4 - para divis�o");
		Integer operacao = scan.nextInt();
		
		System.out.print("digite o segundo n�mero: ");
		Double numberTwo = scan.nextDouble();
		
		Boolean calculator = operacao.equals(1);
		Double result = 0.0;
		
		if(calculator) {
			result = numberOne + numberTwo;
			System.out.println("A soma �: " + result);
		}
		else if (operacao == 2){
			result = numberOne - numberTwo;
			System.out.println("A subtra��o �: " + result);
		}
		else if(operacao == 3) {
			result = numberOne * numberTwo;
			System.out.println("A multiplica��o �: " + result);
		}
		else {
			result = numberOne / numberTwo;
			System.out.println("A divis�o �: " + result);
		}
		scan.close();
	}
}
