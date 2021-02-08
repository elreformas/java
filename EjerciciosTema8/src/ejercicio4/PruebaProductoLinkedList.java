package ejercicio4;

public class PruebaProductoLinkedList {

	public static void main(String[] args) {
		
		LinkedListProducto lista1 = new LinkedListProducto();
	
		productoLinked p1 = new productoLinked(11, "Leche", "Lácteo", 4.95, 20);
		productoLinked p2 = new productoLinked(7, "Galletas", "Aperitivo", 2.50, 30);
		productoLinked p3 = new productoLinked(16, "Burn", "Bebida Energética", 1.50, 15); 
		
		
		lista1.agregarProducto(p1);
		lista1.agregarProducto(p2);
		lista1.agregarProducto(p3);
		
		//lista1.cambiarPrecio(7, 3.99);
		
		//lista1.eliminar(16);
		
		lista1.imprimirLista(lista1);
		
		//lista1.buscarCodigo(11);
		
		//lista1.buscarProducto(2);
		
		

}
}