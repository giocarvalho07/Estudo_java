package vetor;

import java.util.Scanner;

public class DesafioCadastroTelefones {

	public static void main(String[] args) {
		
		String[] numeroTelefones = new String[5];
		Scanner scan = new Scanner(System.in);
		
		for(int contador = 0; contador < numeroTelefones.length; contador++) {
			System.out.println("Digite o n�mero de telefone: ");
			numeroTelefones[contador] = scan.next();
		}
		
		for(int contador = 0; contador < numeroTelefones.length; contador++) {
			System.out.println((contador + 1 ) + " � " + numeroTelefones[contador]);
		}
		
		scan.close();
	}
}
