package POO_1;

public class Producto {
	
			private int codigo;
			private String nombre;
			private double precio;
			private String descripcion;
			private int stock;
			
			
		public Producto(int cod, String nom, double prec, String desc, int stck) {
				codigo = cod; 
				nombre = nom;
				precio = prec;
				descripcion = desc;
				stock = stck;	
				
			}
			
		public int un_codigo ()  {
			return codigo; 
		}
		
		public String un_nombre() {
			return nombre;
		}
		public double un_precio() {
			return precio;
		
		}
		public String un_descripcion() {
			return descripcion;
		
		}
		public int un_stock() {
			return stock;
		
		}

}

