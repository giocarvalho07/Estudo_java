package vetor;

public class vetorBidimensional {

	public static void main(String[] args) {

		Double[] temepraturaJaneiro = new Double[] {32.2, 33.0, 26.3};
		Double[] temepraturaFevereiro = new Double[] {35.1, 30.0, 28.5};
	
		Double[][] temperaturaAnual = new Double[][] {temepraturaJaneiro, temepraturaFevereiro};
		
		for(int contador = 0; contador < temperaturaAnual.length; contador++) {
			System.out.println("mês: " + (contador + 1));
			
			Double[] meses = temperaturaAnual[contador];
			
			for(int iteracao = 0; iteracao < meses.length; iteracao++) {
				
				Double dia = meses[iteracao];
				
				System.out.println("dia " + (iteracao + 1) + ": " + dia);
				
			}
			
			
			
			
			
		}

	}
}
