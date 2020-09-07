package decisao;

public class IfSimples {

	public static void main(String[] args) {
		
		
		Double emprestimoSolicitado = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentacao = (movimentacaoMedia * 2) >= emprestimoSolicitado;
		Boolean tempoAbertura = true;
		Boolean nomeLimpo = true;
		
		Boolean liberaEmprestimo = movimentacao && tempoAbertura
				&& nomeLimpo;
		
		if(liberaEmprestimo){
			System.out.println("sim, pode liberar");
		}
		else {
			System.out.println("não pode !");
		}

	}
}

