package metodo;

import java.util.Scanner;

public class MetodoIntroducao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		imprimirTraco();
		System.out.println("bem vindo a programa");
		
		imprimirTraco();
		
		System.out.print("Digite seu nome: ");
		String nome = scan.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scan.next();
		imprimirTraco();
		
		System.out.println("Seu nome completo: " + nome + " " + sobrenome);
		
		scan.close();
	}
	
	static void  imprimirTraco() {
		System.out.println("=================");
	}
	
}
