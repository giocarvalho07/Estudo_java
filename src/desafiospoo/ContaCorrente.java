package desafiospoo;

public class ContaCorrente {
	
	String numeroConta;
	Double saldo;
	Boolean status;
	Double limite;
	
	Boolean acessarConta() {
		Boolean verificarNumConta = equals(numeroConta);
		
		if(verificarNumConta == verificarNumConta) {
			System.out.println("Acesso ok !");
		}
		else {
			System.out.println("Conta incorreta!");
			System.out.println("Digite novamente o número da sua conta");
		}
		
		return verificarNumConta;
	}
	
	Double sacarDinheiro(Double sacarDinheiro) {
		
		Boolean verificarAcesso = acessarConta().equals(numeroConta);
		Double sacar = sacarDinheiro;
		Double saldoConta = saldo - sacarDinheiro;
		
		if(verificarAcesso == verificarAcesso) {
			Boolean verificarSaldo = saldo >= 0;
			sacar = sacarDinheiro;
			saldoConta = sacarDinheiro - saldo;
		}
		else {
			System.out.println("Verifique o acesso a sua conta! ");
			System.out.println("Verifique o saldo da sua conta! ");
		}
		
		return sacar;
	}

}
