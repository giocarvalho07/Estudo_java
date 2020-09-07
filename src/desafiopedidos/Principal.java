package desafiopedidos;

public class Principal {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		
		pedido.setCodigo(123);
		pedido.setSubtotal(50.00);
		pedido.setDesconto(0.00);
		pedido.setTotal(50.00);
		
		System.out.println("pedido  nº " + pedido.getCodigo() + " com o subtotal de "
				+ (pedido.getSubtotal() - pedido.getDesconto()) + " total de "
				+ pedido.getTotal());
		
	}
}
