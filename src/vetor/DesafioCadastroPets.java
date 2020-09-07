package vetor;

import java.util.Scanner;

public class DesafioCadastroPets {

	public static void main(String[] args) {
		
		String[] nomesPets = new String[5];
		
		Scanner leitora = new Scanner(System.in);
		
		
		for(int contador = 0; contador < nomesPets.length; contador++) {
			System.out.print("Cadastre o nome do " + (contador + 1) + " º Pet: ");
			nomesPets[contador] = leitora.next();
		}
		
		System.out.println("=====================");
		System.out.println("Lista de Pets cadastrados ! ");
		
		for(int contador = 0; contador < nomesPets.length; contador++) {
			System.out.println((contador + 1) + " º - " + nomesPets[contador] );
		}
		
		leitora.close();
	}
}
