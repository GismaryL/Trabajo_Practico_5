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
			
			
			archivo = new File(rutaArchivo);
			lectorArchivo = new FileReader(archivo);
			lectorBuffer = new BufferedReader(lectorArchivo);
			
			
			String linea = "";
			
			while( (linea = lectorBuffer.readLine() ) != null) {
				
				lineas.add(linea);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		
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
