package desafiosarray;

import java.util.Scanner;

public class DesafioArray4 {

	public static void main(String[] args) {

		String[] tarefas = new String[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("cadastre suas tarefas: ");
		
		for(int contador = 0; contador<tarefas.length; contador++) {
			System.out.print((contador + 1) + " º tarefa: " );
			tarefas[contador] = scan.nextLine();
		}
		
		System.out.println("Lista de tarefas: ");
		
		for(String tarefa: tarefas) {
			System.out.println("tarefa: " + tarefa);
		}
		
		
		scan.close();
		
	}
}
