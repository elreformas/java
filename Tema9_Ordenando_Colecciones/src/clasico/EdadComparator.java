package clasico;
import java.util.Comparator;

class EdadComparator implements Comparator<Usuario1> {
 
	public int compare(Usuario1 u1, Usuario1 u2) {
		
		return u1.getEdad() - u2.getEdad();

 }

 }

