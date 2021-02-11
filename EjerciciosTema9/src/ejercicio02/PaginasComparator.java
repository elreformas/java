package ejercicio02;
import java.util.Comparator;

class PaginasComparator implements Comparator<Libro> {
 
	public int compare(Libro l1, Libro l2) {

		return l1.damePaginas() - l2.damePaginas();
		
	}
}