package operadores;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o primeiro número: ");
		Double numberOne = scan.nextDouble();
		
		System.out.println("digite a operação desejada: ");
		System.out.println("1 - para adição");
		System.out.println("2 - para subtração");
		System.out.println("3 - para multiplicação");
		System.out.println("4 - para divisão");
		Integer operacao = scan.nextInt();
		
		System.out.print("digite o segundo número: ");
		Double numberTwo = scan.nextDouble();
		
		Boolean calculator = operacao.equals(1);
		Double result = 0.0;
		
		if(calculator) {
			result = numberOne + numberTwo;
			System.out.println("A soma é: " + result);
		}
		else if (operacao == 2){
			result = numberOne - numberTwo;
			System.out.println("A subtração é: " + result);
		}
		else if(operacao == 3) {
			result = numberOne * numberTwo;
			System.out.println("A multiplicação é: " + result);
		}
		else {
			result = numberOne / numberTwo;
			System.out.println("A divisão é: " + result);
		}
		scan.close();
	}
}
