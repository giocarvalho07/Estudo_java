package vetor;

public class VetorDiversasDimensoes {

	public static void main(String[] args) {

		Double[] semanaUm = new Double[]{ 200.0, 1500.99, 1250.0, 2100.0, 1562.0, 970.0, 5.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 500.0, 3250.0, 100.0, 1430.0, 500.0, 0.42 };
		Double[] semanaTres = new Double[]{ 1780.22, 1300.48, 1450.0, 2080.0, 1390.0, 80.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1850.0, 1850.75, 2100.0, 1220.0, 998.0, 20.0 };
		
		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Double[] [] [] ano = new Double[] [] [] {mes};

	}	
}
