package metodo;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		

		Double[] numeros = new Double[2];
		Scanner leitora = new Scanner(System.in);
		
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.print("digite o " + (contador + 1) + " º número: ");
			numeros[contador] = leitora.nextDouble();
		}
		
		String[] listaOperacoes = new String[] {"1 - soma", "2 - subtração", "3 - multiplicação", "4 - divisão"};
		
		System.out.println("Escolha uma operação: ");
		
		for(int contadora = 0; contadora < listaOperacoes.length; contadora++) {
			System.out.println(listaOperacoes[contadora]);
		}
		
		Integer operacaoRecebida = leitora.nextInt();
		
		boolean validacao = operacaoRecebida < 4 && operacaoRecebida > 0;
		
		if(!validacao) {
			operacaoInvalida();
		}
		
		Boolean operacaoSoma = operacaoRecebida == 1;
		Boolean operacaoSubtracao = operacaoRecebida == 2;
		Boolean operacaoMultiplicacao = operacaoRecebida == 3;
		Boolean operacaoDivisao = operacaoRecebida == 4;
		
		if(operacaoSoma) {
			System.out.println(operacaoSoma(numeros));
		}
		else if(operacaoSubtracao) {
			System.out.println(operacaoSubtracao(numeros));
		}
		else if(operacaoMultiplicacao) {
			System.out.println(operacaoMultiplicao(numeros));
		}
		else if(operacaoDivisao) {
			System.out.println(operacaoDivisao(numeros));
		}
		else {
			operacaoInvalida();
		}
		
		
		
		leitora.close();
		
	}
	



	static Double operacaoSoma(Double[] numeroCalculos) {
		Double resultado = (numeroCalculos[0] + numeroCalculos[1]);
		System.out.println("A soma é: " );
		return resultado;
	}
	
	
	static Double operacaoSubtracao(Double[] numeroCalculos) {
		Double resultado = (numeroCalculos[0] - numeroCalculos[1]);
		System.out.println("A subtração é: " );
		return resultado;
	}
	
	static Double operacaoMultiplicao(Double[] numeroCalculos) {
		Double resultado = (numeroCalculos[0] * numeroCalculos[1]);
		System.out.println("A multiplicação é: " );
		return resultado;
	}
	
	static Double operacaoDivisao(Double[] numeroCalculos) {
		Double resultado = (numeroCalculos[0] % numeroCalculos[1]);
		System.out.println("A divisão é: ");
		return resultado;
	}
	
	
	static void operacaoInvalida() {
		System.err.println("Operação inválida!");
		System.exit(1);
	}
	
	
	
}
