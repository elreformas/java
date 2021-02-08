package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayProducto {
	
	private ArrayList<producto> inventario;
	
	public ArrayProducto() {
		
		inventario = new ArrayList<producto>();
		
	}
	
	
	public boolean agregarProducto(producto p) {
		
		return inventario.add(p); // Como el metodo add devuelve true de forma predeterminada, se puede hacer en una sola linea.
	}
	
	
	public void buscarProducto(int pos) {
		
		System.out.println(inventario.get(pos - 1));
		
	}
	
	
	public void buscarCodigo(int num) {

        int cod = 0;
        boolean localizacion = true;
        while ((cod < inventario.size()) && (localizacion)){

            if (num == inventario.get(cod).dameCodigo()) {

                localizacion = false;
                System.out.println(inventario.get(cod));
                

            } 
            
            else if (num != inventario.get(cod).dameCodigo()) {

                cod++;

            }

        }

    }
	
	public void cambiarPrecio(int codigo, double nuevoPrecio) {

        int id = 0;
        boolean escaneamiento = true;
        while ((id < inventario.size()) && (escaneamiento)){

            if (codigo == inventario.get(id).dameCodigo()) {

                
                inventario.get(id).setPrecio(nuevoPrecio);
                escaneamiento = false;
            } 
            
            else if (codigo != inventario.get(id).dameCodigo()) {

                id++;

            }

        }

    }
	
	
	public void eliminar(int codigo) {

        int code = 0;
        boolean identificacion = true;
        while ((code < inventario.size()) && (identificacion)){

            if (codigo == inventario.get(code).dameCodigo()) {

                
                inventario.remove(code);
                identificacion = false;
            } 
            
            else if (codigo != inventario.get(code).dameCodigo()) {

                code++;

            }

        }

    }
	
	
	public int tamaño() {
		
		return inventario.size();
	}
	
	public void imprimirLista(ArrayProducto n) {
		
		System.out.println(n);
		
		}


	public String toString() {
		
		String cad = ("El inventario tiene actualmente " + inventario.size() + " productos: \n\n");
			
		Iterator puntero = inventario.iterator();
			
		while (puntero.hasNext()) {
				
		cad += (puntero.next());
		
	}
		
		return cad + "\n--------------------------------";
	}
}
