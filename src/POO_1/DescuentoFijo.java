package POO_1;

public class DescuentoFijo extends Descuento {
	
	
	public DescuentoFijo (String descripcion,String tipoDesc, double valor) {
		super (descripcion,tipoDesc, valor);
		this.valor = valor;

	}
	

	public double valorFinal(double montoFinal) {
		double descuento2= 0;
		
		if (tipoDesc == "Cupon") {
			
			descuento2= montoFinal - this.dameValorDescuento();
		}else {
			descuento2 = montoFinal;
		}
		
		return descuento2;
		
	}


}




