package vetor;

import java.util.Scanner;

public class DesafioCadastroTarefas {

	public static void main(String[] args) {
		
		String[] cadastroTarefas = new String[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("cadastre uma tarefa ");
		
		for( int contador = 0; contador < cadastroTarefas.length; contador++  ) {
			System.out.print(contador + " � tarefa: ");
			cadastroTarefas[contador] = scan.nextLine();
		}
		
		System.out.println(" As tarefas s�o: ");
		
		for( int contador = 0; contador < cadastroTarefas.length; contador++ ) {
			System.out.println(cadastroTarefas[contador] );
		}
		
		scan.close();
	}
}
