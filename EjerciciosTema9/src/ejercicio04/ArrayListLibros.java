package ejercicio04;

import java.util.TreeSet;
import java.util.Iterator;


// Repaso ArrayList

//añadido el collections.sort

public class ArrayListLibros {
  // private final static int MAX = 100; no tiene sentido....
  private TreeSet<Libro> lista = new TreeSet<Libro>();
  
  public ArrayListLibros() {
    lista = new TreeSet<Libro>();
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
	 
	  for (Libro l : lista) {
		    
		  System.out.println(l + "\n------------------------\n");
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