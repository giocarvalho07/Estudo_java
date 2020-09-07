package leituraescritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		
		for(int contador = 0; contador < 5; contador++) {
			String nome = scan.nextLine();
			linhas.add(nome);
		}
		
		
		Path arquivo = Paths.get("D:\\developer\\backend\\java\\algaworks\\arquivoEscrita");
		Files.write(arquivo, linhas);
		
		System.out.println("fim");
		
		scan.close();
		
	}
}
