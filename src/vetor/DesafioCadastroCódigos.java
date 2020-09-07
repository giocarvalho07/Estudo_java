package vetor;

import java.util.Scanner;

public class DesafioCadastroCódigos {

	public static void main(String[] args) {
		
		Integer[] codigo = new Integer[4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int contador = 0; contador < codigo.length; contador++) {
			System.out.print("cadastre o código: ");
			codigo[contador] = scan.nextInt();
		}
		
		System.out.println("==================");
		System.out.println("lista de códigos ");
		
		for(int contador = 0; contador < codigo.length; contador++) {
			System.out.println((contador + 1) + " º " + codigo[contador]);
		}

		scan.close();
	}
}
