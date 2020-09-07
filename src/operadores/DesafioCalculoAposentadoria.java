package operadores;

import java.util.Scanner;

public class DesafioCalculoAposentadoria {
	
	static final Integer IDADE_PARA_APOSENTAR = 55;
    static final Integer CONTRIBUICAO_PARA_APOSENTAR = 25;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("digite seu nome: ");
		String nomeAposentadoria = scan.nextLine();
		
		
		System.out.print("digite sua idade: ");
		Integer idadeAposentadoria = scan.nextInt();
		
		System.out.println("anos de contribuição a previdencia: ");
		Integer contribuicaoAposentadoria = scan.nextInt();
		
		Boolean podeAposentarIdade = idadeAposentadoria >= IDADE_PARA_APOSENTAR;
		Boolean podeAposentarContribuicao = contribuicaoAposentadoria >= CONTRIBUICAO_PARA_APOSENTAR;
		
		Integer idadeRestante = IDADE_PARA_APOSENTAR - idadeAposentadoria;
		Integer contribuicaoRestante = CONTRIBUICAO_PARA_APOSENTAR - contribuicaoAposentadoria;
		
		
		if(podeAposentarIdade && podeAposentarContribuicao){
			System.out.println(nomeAposentadoria + " você já pode se aposentar");
		}
		else{
			System.out.println(nomeAposentadoria + " você não pode se aposentar, pois faltam " + idadeRestante + " anos de idade !");
			System.out.println(nomeAposentadoria + "você não pode se aposentar, pois faltam " + contribuicaoRestante + "anos de contribuição ! ");
		}
		
		scan.close();
	}
}
