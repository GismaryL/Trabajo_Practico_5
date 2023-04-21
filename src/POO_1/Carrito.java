package POO_1;

	public class Carrito {

		private int num;
		private Cliente clie;
		private double montoCarrito;
		private DescuentoPorcentaje descPorc;
		private DescuentoFijo cupDesc;
		
		public Carrito(int num, Cliente c) {
			this.num =  num;
			setClie(c);	
			this.descPorc = null;
			this.cupDesc = null;
		}
		public int dameNum() {
			return num;
		}
		public double dameMontoCarrito() {
			return montoCarrito;
		}
		public void mostrarMontoCarrito(double monto) {
			montoCarrito = monto;
			System.out.println("Total de la compra: "+montoCarrito);
			
		}
		public DescuentoPorcentaje getDescPorc() {
			return descPorc;
		}
		public void setDescPorc(DescuentoPorcentaje descPorc) {
			this.descPorc = descPorc;
		}
		public DescuentoFijo getCupDesc() {
			return cupDesc;
		}
		public void setCupDesc(DescuentoFijo cupDesc) {
			this.cupDesc = cupDesc;
		}
		public Cliente getClie() {
			return clie;
		}
		public void setClie(Cliente clie) {
			this.clie = clie;
		}
		
		

	}



