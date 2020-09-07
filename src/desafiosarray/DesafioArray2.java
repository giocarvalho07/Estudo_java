package desafiosarray;

public class DesafioArray2 {

	public static void main(String[] args) {

		String[] nomes = new String[] {"joão", "maria", "pedro"};
		
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.println("Nome: " + nomes[contador]);
		}
		
		System.out.println("--------------");
		
		for(String nome: nomes) {
			System.out.println("Nome: " + nome);
		}

	}

}
