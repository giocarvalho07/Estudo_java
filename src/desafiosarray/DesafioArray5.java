package desafiosarray;

import java.util.Scanner;

public class DesafioArray5 {

	public static void main(String[] args) {

		Double[] temepraturaJaneiro = new Double[2];
		Double[] temepraturaFevereiro = new Double[2];
		Double[][] temperaturaAnual = new Double[][] {temepraturaJaneiro, temepraturaFevereiro};
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Janeiro");
		for(int contador =0; contador<temepraturaJaneiro.length; contador++) {
			System.out.print((contador + 1) + " º temperatura :");
			temepraturaJaneiro[contador] = scan.nextDouble(); 
		}
		
		System.out.println("fevereiro");
		for(int contador = 0; contador<temepraturaFevereiro.length; contador++) {
			System.out.print((contador+1) + " º temepratura: ");
			temepraturaFevereiro[contador] = scan.nextDouble(); 
		}
		
		for(int contador= 0; contador<temperaturaAnual.length; contador++) {
			System.out.println("Mês: " + (contador + 1));
			
			Double[] meses = temperaturaAnual[contador];
			
			
			for(Double mes: meses) {
				System.out.println(mes);
			}
			

		}
		
		
		scan.close();
	}
}
