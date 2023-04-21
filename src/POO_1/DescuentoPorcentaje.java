package POO_1;

public class DescuentoPorcentaje extends Descuento {
	
	
	public DescuentoPorcentaje (String descripcion,String tipoDesc, double valor) {
		super (descripcion,tipoDesc, valor);
		
	}


public double dameMontoFinal(double monto) {
	
	double descuento1;
	double total;
	
	if (this.tipoDesc == "Efectivo") {
		
		 descuento1 = monto * this.valor;
		 total= monto - descuento1;
		
	}else {
		return monto;
	}
	
	return total;
	
}

@Override
public double valorFinal(double montoFinal) {
	
	return 0;
}



}