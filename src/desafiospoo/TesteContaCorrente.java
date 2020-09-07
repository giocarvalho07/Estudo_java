package desafiospoo;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		
		ContaCorrente contaCorrente = new ContaCorrente();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número da sua conta: ");
		contaCorrente.numeroConta = scan.nextLine();
		
		contaCorrente.saldo = 100.00; 
		
		contaCorrente.status = true;

		contaCorrente.limite = 1.0;
		
		contaCorrente.acessarConta();
		
		System.out.println("=======================");
		
		System.out.println("Seu saldo é: " + contaCorrente.saldo);
		
		System.out.println("Digite o quanto você quer sacar: ");
		Double sacar = scan.nextDouble();
		
		sacar = contaCorrente.sacarDinheiro(sacar);
		System.out.println("Você sacou: " + sacar);
		System.out.println("Seu saldo atual é: " + (contaCorrente.saldo - sacar));
		
		
		scan.close();
	}

}
