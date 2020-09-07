package operadores;

public class OperadorLogico {
	
	public static void main(String[] args) {
		
		Boolean compraMaiorQue100 = true;
		
		Boolean blackFriday = false;
		
		Boolean aplicarDesconto = compraMaiorQue100 || blackFriday;
		
		if(aplicarDesconto){
			System.out.println("Desconto aplicado !");
		}
		else{
			System.out.println("Você não tem desconto!");
		}
	}
}
