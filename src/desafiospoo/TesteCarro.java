package desafiospoo;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Carro carroPasseio = new Carro();

		carroPasseio.marca = "Fiat";
		carroPasseio.modelo = "Bravo";
		carroPasseio.numPassageiros = 5;
		carroPasseio.capCombustivel = 100.00;
		carroPasseio.consumoCombistivel = 0.2;
		
		System.out.println(carroPasseio.marca);
		System.out.println(carroPasseio.modelo);
		
		carroPasseio.exibirAutonomia();
		
		Double autonomia = carroPasseio.obterAutonomia();
		System.out.println("Autonomia do carro: " + autonomia);
		
		System.out.print("Digite a quantidade de km: ");
		Double qtdCombustivel = scan.nextDouble();
		qtdCombustivel = carroPasseio.calcularCombustivel(qtdCombustivel);
		System.out.println("Quantidade de combustivel: " + qtdCombustivel);
		
		scan.close();
	}

}
