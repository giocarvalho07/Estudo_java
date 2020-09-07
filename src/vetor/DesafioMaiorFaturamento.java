package vetor;

public class DesafioMaiorFaturamento {

	public static void main(String[] args) {
		Double[] semanaUm = new Double[]{ 200.0, 1500.99, 1250.0, 2100.0, 1562.0, 970.0, 5.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 500.0, 3250.0, 100.0, 1430.0, 500.0, 0.42 };
		Double[] semanaTres = new Double[]{ 1780.22, 1300.48, 1450.0, 2080.0, 1390.0, 80.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1850.0, 1850.75, 2100.0, 1220.0, 998.0, 20.0 };
		
		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		
		Double totalMaiorFaturamento = 0.0;
		Integer semanaMaiorFaturamento = 0;
		
		
		for(int contador = 0; contador < mes.length; contador++) {
			Double[] semanas = mes[contador];
			System.out.println("Semana: " + (contador + 1));
			
			Double total = 0.0;
			
			for(int contadora = 0; contadora < semanas.length; contadora++) {
				System.out.println((contadora + 1) + " º dia: " + semanas[contadora]);
				total += semanas[contadora];
			}
			
			System.out.println("Total de faturamento da " + (contador + 1) + "º semana, R$ " + total);
			System.out.println("==========================");
			
			if(total > totalMaiorFaturamento) {
				totalMaiorFaturamento = total;
				semanaMaiorFaturamento = contador + 1;
				
			}
			
		}
		
		
		System.out.println("A semana " + semanaMaiorFaturamento + " º faturou R$" + totalMaiorFaturamento );
		
		
		
	}
}
