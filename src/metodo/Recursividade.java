package metodo;

public class Recursividade {

	public static void main(String[] args) {
	
		
		imprimirNumero(0);
		
	}
	
	static void imprimirNumero(Integer numero) {
		System.out.println("n�mero: " + numero);
		
		if (numero < 10) {
			imprimirNumero(++numero);
		}
	}
	
}
