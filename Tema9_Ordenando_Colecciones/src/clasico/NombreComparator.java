package clasico;
import java.util.Comparator;

class NombreComparator implements Comparator<Usuario1> {
 
	public int compare(Usuario1 u1, Usuario1 u2) {

		return u1.getNombre().compareTo(u2.getNombre());
		
	}
}