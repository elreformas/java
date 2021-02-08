package ejercicio4;

public class productoLinked {

	private int codigo;
	private String nombre;
	private String tipo;
	private double precio;
	private int stock;
	
	
	public productoLinked(int codigo, String nombre, String tipo, double precio, int stock) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.stock = stock;
		
	}
	
	public String dameProducto() {
		
		return nombre;
	}
	
	public int dameCodigo() {
		
		return codigo;
	}
	
	public void setPrecio(double precio) {
		
		this.precio = precio;
		
	}

	
	public String toString() {
	    return  ("Nombre: " + nombre  + "\n"  +
	              "Tipo: " + tipo  + "\n"  +
	              "Codigo: " + codigo  + "\n" +
	              "Precio: " + precio + " €" + "\n"  +
	              "Stock: " + stock) + "\n\n";
	    }
	
	
	
	
}