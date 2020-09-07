package decisao;

import java.util.Scanner;

public class DesafioConcursoPublico {

	static final Integer NOTA_CORTE = 60; 
	static final Integer NOTA_APROVADO = 150;
	
	public static void main(String[] args) {
		
		Scanner leitora = new Scanner(System.in);
		
		System.out.print("digite a nota de matem�tica: ");
		Integer notaMatematica = leitora.nextInt();
		
		System.out.print("digite a nota de portugues: ");
		Integer notaPortugues = leitora.nextInt();
		
		Boolean notaParcialMatematica = notaMatematica >= NOTA_CORTE;
		Boolean notaParcialPortugues = notaPortugues >= NOTA_CORTE;
		Boolean calculoMedia = (notaMatematica + notaPortugues) >= NOTA_APROVADO;
		
		
		if(notaParcialMatematica && notaParcialPortugues && calculoMedia){
			Integer mediaProva = notaMatematica + notaPortugues;
			System.out.println("O aluno est� aprovado, media final : " + mediaProva);	
		}
		else {
			System.out.println("o aluno est� reprovado");
		}
		
		leitora.close();
	}
}
