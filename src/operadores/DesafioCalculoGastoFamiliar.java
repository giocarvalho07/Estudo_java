package operadores;

import java.util.Scanner;

public class DesafioCalculoGastoFamiliar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite o pre�o da conta de LUZ: ");
		Double contaLuz = scan.nextDouble();
		
		System.out.print("digite o pre�o da conta de AGUA: ");
		Double contaAgua = scan.nextDouble();
		
		System.out.print("digite o pre�o da conta de TELEFONE/INTERNET: ");
		Double contaTelefone_Internet = scan.nextDouble();
		
		System.out.print("digite o pre�o da conta de ESCOLA/FACULDADE: ");
		Double contaEscola_Faculdade = scan.nextDouble();
		
		System.out.print("digite o pre�o da conta de CART�O DE CR�DITO: ");
		Double contaCartao_Credito = scan.nextDouble();
		
		System.out.print("digite o pre�o da conta de SUPERMERCADO: ");
		Double contaSupermercado = scan.nextDouble();
		
		Double totalMes = contaAgua + contaCartao_Credito + contaEscola_Faculdade + contaLuz + contaSupermercado + contaTelefone_Internet;
		
		System.out.println("total gasto no m�s � : " + totalMes);
		scan.close();
	}
}
