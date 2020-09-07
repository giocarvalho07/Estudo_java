package leituraescritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivo {

	public static void main(String[] args) throws IOException {
		
		
		Path arquivoLeitura = Paths.get("D:\\developer\\backend\\java\\algaworks\\listaDiaria");
		
		List<String> linhas = Files.readAllLines(arquivoLeitura);
		
		for(int contador = 0; contador < linhas.size(); contador++) {
			String tarefas = linhas.get(contador);
			System.out.println(" tarefas: " + tarefas);
		}
	}
}
