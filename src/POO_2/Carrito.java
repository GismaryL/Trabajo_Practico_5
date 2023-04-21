package POO_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private String url;
	
	public Carrito () {
		
	}
	
public void precio() {
		
		String urlArchivo= "ProductosCarrito.txt";
		List<String> listProd = LeerArchivo(urlArchivo);
		double sumaProd =0;
		
		System.out.println("cant\tPrecio\tProducto\t");
		for (String lineaL : listProd) {
					
			String[] producto = lineaL.split(";");
				
		    	  sumaProd = Double.parseDouble(producto[0])*Double.parseDouble(producto[1])+sumaProd;  
		    	  System.out.println(producto[0]+"\t"+producto[1]+"\t"+producto[2]+"\t");
		      } 
		
			  System.out.println("================================");
		      System.out.println("TOTAL "+sumaProd);
	}
	
	
private List<String> LeerArchivo(String rutaArchivo) {
		File archivo = null;
		FileReader lectorArchivo = null;
		BufferedReader lectorBuffer = null;
		List<String> lineas = new ArrayList<String>();
		
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			
			archivo = new File(rutaArchivo);
			lectorArchivo = new FileReader(archivo);
			lectorBuffer = new BufferedReader(lectorArchivo);
			
			//Lectura del fichero
			
			String linea = "";
			
			while( (linea = lectorBuffer.readLine() ) != null) {
				//System.out.println(linea);
				lineas.add(linea);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			 // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
			
			try {
				if(lectorBuffer != null) {
					lectorBuffer.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return lineas;
	}

}
