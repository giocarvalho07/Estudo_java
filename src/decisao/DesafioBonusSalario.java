package decisao;

import java.util.Scanner;

public class DesafioBonusSalario {

	static final Double SALDO_BONUS = 80.0 / 100.0;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("digite a meta de faturamento anual da empresa, 2019: ");
		Double metaFaturamento = scanner.nextDouble();
		
		System.out.print("digite o faturamento real da empresa no ultimo ano, 2019: ");
		Double realFaturamento = scanner.nextDouble();
		
		System.out.print("digite a média salarial do funcionário(a) para o ano anterior, 2019: ");
		Double mediaSalarial = scanner.nextDouble();
		
		
		Double bonusIntegral = metaFaturamento * SALDO_BONUS;
		Double bonusParcial = mediaSalarial * SALDO_BONUS;
		
		Boolean bonusTotal = realFaturamento >= metaFaturamento;
		Boolean bonusIncompleto = realFaturamento.equals(realFaturamento);
		
		if(bonusTotal) {
			System.out.println("bonus total: " + mediaSalarial);
		}
		else if(bonusIncompleto) {
			System.out.println("Bonus parcial: " + bonusParcial);
		}
		else {
			System.out.println("sua equipe não terá bonus" );
		}

		scanner.close();
	}
}
