package POO_1;

public abstract class Descuento {
	public String descripcion;
	public String tipoDesc;
    public double valor;
 
    
    public Descuento(String descripcion, String tipoDesc, double valor) {
                    
    	this.descripcion = descripcion;
        this.tipoDesc = tipoDesc;
        this.valor = valor;
    
    }


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String dameTipo() {
		return tipoDesc;
	}


	public void setTipo(String tipo) {
		this.tipoDesc = tipo;
	}


	public double dameValorDescuento() {
		return valor;
	}
	
	public void setMontoDescuento(double valor) {
		this.valor = valor;
	}


	public double dameMontoDescuento (double monto){
		
		return monto * valor;

	}
	
	
	public abstract double valorFinal(double montoFinal);
	


}
