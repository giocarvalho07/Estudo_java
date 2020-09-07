package decisao;

import java.util.Scanner;

public class DesafioDiasSemana {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("escolha o dia da semana para realizar esta atividade: ");
		System.out.println(" 1 - domingo ");
		System.out.println(" 2 - segunda ");
		System.out.println(" 3 - terca ");
		System.out.println(" 4 - quarta ");
		System.out.println(" 5 - quinta ");
		System.out.println(" 6 - sexta ");
		System.out.println(" 7 - sabado ");
		System.out.print(": ");
		
		Integer dataTarefa = scan.nextInt();
		
		switch (dataTarefa) {
		case 1: 
			System.out.println("Sua tarefa será realizada no domingo");
			break;
		case 2: 
			System.out.println("Sua tarefa será realizada na segunda");
			break;
		case 3: 
			System.out.println("Sua tarefa será realizada na terça");
			break;
		case 4: 
			System.out.println("Sua tarefa será realizada na quarta");
			break;
		case 5: 
			System.out.println("Sua tarefa será realizada na quinta");
			break;
		case 6: 
			System.out.println("Sua tarefa será realizada na sexta");
			break;
		case 7: 
			System.out.println("Sua tarefa será realizada no sabado");
			break;
		default:
			System.err.println("Digite um dia dá semana válido");
			System.exit(1);
		}
		
		
		scan.close();
	}
}
