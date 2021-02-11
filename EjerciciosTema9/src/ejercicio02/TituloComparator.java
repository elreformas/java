package ejercicio02;
import java.util.Comparator;

class TituloComparator implements Comparator<Libro> {

	public int compare(Libro l1, Libro l2) {
		
		return l1.dameTitulo().compareTo(l2.dameTitulo());
	}
}
