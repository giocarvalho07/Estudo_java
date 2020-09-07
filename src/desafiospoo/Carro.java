package desafiospoo;

public class Carro {
	
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombistivel;
	
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é "
			+ capCombustivel * consumoCombistivel + " Km");
	}
	
	Double obterAutonomia() {	
		Double resultadoAutonomia = capCombustivel * consumoCombistivel;
		return resultadoAutonomia;
	}
	
	Double calcularCombustivel(Double km) {
		Double qtdCombustivel = km/consumoCombistivel;
		return qtdCombustivel;
	}

}
