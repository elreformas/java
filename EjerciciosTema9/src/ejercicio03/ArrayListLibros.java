package ejercicio03;

import java.util.HashSet;
import java.util.Iterator;

public class ArrayListLibros {
  
  private HashSet<Libro> lista = new HashSet<Libro>();
  
  public ArrayListLibros() {
    lista = new HashSet<Libro>();
  }

 // public boolean llena() { return ... no tiene sentido }

  public boolean vacia() { return lista.isEmpty(); }

  public int length() { return lista.size(); }


  public boolean buscaLibro(Libro l) {
	
	return lista.contains(l);
}
  
 public boolean insertar(Libro p) {
  
    lista.add(p);
    return true;
  }
  
  public boolean eliminarLibro(Libro l) {
	
	  return lista.remove(l);
  }

  
  public void buscarContenido(String c) {
	  
	  Iterator<Libro> puntero = lista.iterator();
	  boolean contiene = false;
	  while(contiene == false && puntero.hasNext()) {
		  
		  Libro l = puntero.next();
		  if (l.dameTitulo().contains(c)) {
			  contiene = true;
			  System.out.println(l);
		  }
	  }
	  
	  if (contiene == false) {
		  
		  System.out.println("El libro que buscas no existe.");
	  }
  }

  public void imprimir() {
	  
	  System.out.println("Los libros de la lista son:\n\n ");
	  Iterator<Libro> puntero = lista.iterator();
	  while (puntero.hasNext()) {
		  
		  System.out.println(puntero.next());
		  System.out.println("\n------------------------\n");
	  }
  }
  
 /* public String toString() {
	  String cad = lista.size() + " Elementos de la lista:\n\n";
	  for (Libro l: lista)
		  cad += l + "\n-----------------------------------------------\n";
	  return cad;
  }
  */
  /*public String toString() {
	  String cad = lista.size() + " Elementos de la lista:\n\n";
	  Iterator it = lista.iterator(); 
	  while(it.hasNext()) {
		  cad += it.next() + "\n-----------------------------------------------\n";
	  }
	  return cad;
  }
  */
}