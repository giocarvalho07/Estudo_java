package desafioescritaarquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DesafioEscritaArquivo {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> texto = new ArrayList<String>();
		
		System.out.println("Lista de rafeas diárias !");
		
		for(int contador = 0; contador < 3; contador++) {
			System.out.print("Digite o título da tarefa: ");
			String tituloTarefa = scan.nextLine();
			texto.add(tituloTarefa);
			
			
			System.out.print("digite a descrição da tarefa: ");
			String descricaoTarefa = scan.nextLine();
			texto.add(descricaoTarefa);
		}
		
		
		Path arquivo = Paths.get("D:\\developer\\backend\\java\\algaworks\\listaDiaria");
		Files.write(arquivo, texto);
		
		scan.close();
	}
}
