package vetor;

public class DesafioMaiorTemperatura {

	public static void main(String[] args) {
		
		Double[] semanaUm = new Double[]{ 32.0, 15.0, 12.0};
		Double[] semanaDois = new Double[]{ 22.0, 25.0, 8.0};
		Double[] semanaTres = new Double[]{ 13.0, 25.0, 36.0};
		
		Double[][] mesTemperatura = new Double[][] {semanaUm, semanaDois, semanaTres};
		
		Double MaiorTemperaturaSemana = 0.0;
		Integer semanaGanhadora = 0;
		
		for(int contador = 0; contador < mesTemperatura.length; contador++) {
			System.out.println("Semana: " + (contador + 1));
			Double[] semana = mesTemperatura[contador];
			
			Double temperaturaSemana = 0.0;
			
			
			for(int contadora = 0; contadora < semana.length; contadora++) {
				System.out.println(semana[contadora]);
				temperaturaSemana += semana[contadora];
				}
				
				System.out.println("total semana : " + temperaturaSemana);
				

				if(temperaturaSemana > MaiorTemperaturaSemana ) {
					MaiorTemperaturaSemana = temperaturaSemana;
					semanaGanhadora = contador + 1;
					}
		
		
		}
				
		
		
		System.out.println("Semana " + semanaGanhadora + " com a maior média " +  MaiorTemperaturaSemana);
			
			
			
	}
}

