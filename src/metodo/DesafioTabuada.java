package metodo;

import java.util.Scanner;

public class DesafioTabuada {
	
	private static final Integer numeroTabuada = 10;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número para a tabuada desejada: ");
		Integer numero = scan.nextInt();
		Integer contador = 0;
		
		imprimirTabuada(numero,contador);
 		
		
		scan.close();
	}
	
	static void imprimirTabuada(Integer valorRecebido, Integer contadorMultiplicar) {
		
		contadorMultiplicar++;
		
		if(contadorMultiplicar <= numeroTabuada) {
			Integer tabuada = valorRecebido * contadorMultiplicar;
			System.out.println(valorRecebido + " x " + contadorMultiplicar + " = " + tabuada);
			
			imprimirTabuada(valorRecebido,contadorMultiplicar);
		}
	}
	
	
}
