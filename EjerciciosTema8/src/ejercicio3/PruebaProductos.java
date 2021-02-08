package ejercicio3;

public class PruebaProductos {

	public static void main(String[] args) {
		
		ArrayProducto lista1 = new ArrayProducto();
	
		producto p1 = new producto(11, "Leche", "Lácteo", 4.95, 20);
		producto p2 = new producto(7, "Galletas", "Aperitivo", 2.50, 30);
		producto p3 = new producto(16, "Burn", "Bebida Energética", 1.50, 15); 
		
		
		lista1.agregarProducto(p1);
		lista1.agregarProducto(p2);
		lista1.agregarProducto(p3);
		
		//lista1.cambiarPrecio(7, 3.99);
		
		//lista1.eliminar(16);
		
		//lista1.imprimirLista(lista1);
		
		//lista1.buscarCodigo(11);
		
		//lista1.buscarProducto(2);
		
		

}
}
