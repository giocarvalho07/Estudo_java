package vetor;

import java.util.Scanner;

public class DesafioCadastroC�digos {

	public static void main(String[] args) {
		
		Integer[] codigo = new Integer[4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int contador = 0; contador < codigo.length; contador++) {
			System.out.print("cadastre o c�digo: ");
			codigo[contador] = scan.nextInt();
		}
		
		System.out.println("==================");
		System.out.println("lista de c�digos ");
		
		for(int contador = 0; contador < codigo.length; contador++) {
			System.out.println((contador + 1) + " � " + codigo[contador]);
		}

		scan.close();
	}
}
