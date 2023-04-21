package POO_1;

public class Cliente {
	
	public Cliente(int dni,String nombre, String dire,String celu, String mail) {
		this.dni=dni;
		this.nombre=nombre;
		this.dire=dire;
		this.celu= celu;
		this.mail=mail;
		estCivil = "Soltero/a";		
	}
	
	
	public int dameDni() {
		return dni;
	}
	public String dameNombre() {
		return nombre;
	}
	public String dameMailDire() {
		return dire+"--"+mail;
	}
	public String dameCelu() {
		return celu;
	}
	public String dameEstCivil() {
		return estCivil;
	}
	public void mostrarPersona() {
		System.out.println("Persona: ");
		System.out.println("DNI: "+dni+"--"+"Nombre: "+nombre);
		System.out.println("Mail: "+mail+"--"+"Direccion: "+dire);
		System.out.println("Celular: "+celu+"--"+"Estado Civil: "+estCivil);
	}
	
	private int dni;
	private String nombre;
	private String dire;
	private String celu;
	private String mail;
	private String estCivil;
}

