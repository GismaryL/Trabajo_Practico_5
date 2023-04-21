package POO_1;

public class ItemCarrito {
	
	private Carrito num; 
	private Producto p;
	private int cant;
	private double montoItem;
	 
	public ItemCarrito(Carrito numero, Producto prod,int can) {
		
		p = prod;
		this.cant = can;
		montoItem = p.un_precio() * can;
	}
	public double dameMontoItem() {
		return montoItem;
	}
	public int dameCantidad() {
		return cant;
	}
	public void mostrarItem() { 
		System.out.println(cant+"\t"+p.un_precio()+"\t"+montoItem+"\t\t"+p.un_nombre());
		
	}
	public void dameTitulo() {
		System.out.println("Cant\tPrecio\tSubTotal\tProducto");
		System.out.println ("==================================================");
	}
	public Carrito getNum() {
		return num;
	}
	public void setNum(Carrito num) {
		this.num = num;
	}
}



