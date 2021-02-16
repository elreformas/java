package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class errores01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		
		try {
		
		System.out.println("Introduce un numero entero: ");
		numero = teclado.nextInt();
		
		System.out.println("El numero es: " + numero);
		
		}
		catch (InputMismatchException Exception) {
			
			System.out.println("No has introducido el tipo de dato correcto");
		}
		

	}

}
