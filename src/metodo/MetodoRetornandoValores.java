package metodo;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class MetodoRetornandoValores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		escolhaOpcao();
		
		lacoRepeticao(cursos);

		escolhaOpcao();
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean posicaoValida = verificarPosicao(posicaoCursoEscolhido, cursos);
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		escolhaOpcao();
		
		lacoRepeticao(formasPagamento);

		escolhaOpcao();
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		posicaoValida = verificarPosicao(posicaoCursoEscolhido, formasPagamento);
		
		if (!posicaoValida) {
			posicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);
		
		scanner.close();
	}
	
	static Boolean verificarPosicao(Integer posicao, String[] vetor) {
		Boolean resultadoPosicao = posicao >= 0 
				&& posicao < vetor.length;
		return resultadoPosicao;
	}
	
	
	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}
	
	static void escolhaOpcao() {
		System.out.println("Escolha a opção desejada: ");
	}
	
	static void posicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void lacoRepeticao(String[]  vetor ) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
	}
			
		
	}
}
