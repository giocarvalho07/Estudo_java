package repeticao;

public class DesafioDivisiveisWhile {

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		
		int contador = 0;
		
		while(contador < numeros.length) {
			Integer divisiveis = numeros[contador];
			
			if( divisiveis % 3 == 0 && (divisiveis % 5 == 0 || divisiveis % 5 == 5)) {
				System.out.println(contador + " º numero: " + divisiveis + " por 3 e 5 ");
			}
			
			contador++;
		}

	}
}
