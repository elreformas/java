package ejercicio05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


	public class Diccionario {


		public static void main(String[] args) {


			HashMap<String, String> diccionario = new HashMap<String, String>();


			diccionario.put("Comer","Eat");
			diccionario.put("Piedra","Stone");
			diccionario.put("Noche","Night");
			diccionario.put("Lasaña","Lasagna");
			diccionario.put("Estrella","Star");
			diccionario.put("Espacio","Space");
			diccionario.put("Galaxia","Galaxy");
			diccionario.put("Universo","Universe");
			diccionario.put("Planeta","Planet");
			diccionario.put("Invierno","Winter");
			diccionario.put("Verano","Summer");
			diccionario.put("Cabra","Goat");
			diccionario.put("Canguro","Kangaroo");
			diccionario.put("Arbol","Tree");
			diccionario.put("Dragón","Dragon");
			diccionario.put("Lobo","Wolf");
			diccionario.put("Sueño","Dream");
			diccionario.put("Craneo","Skull");
			diccionario.put("Morder","Bite");
			diccionario.put("Kilómetro","Kilometer");


			Scanner teclado = new Scanner(System.in);

			int aciertos=0;
			int fallos=0;

			String palabraBuscada;

			for(int i = 1; i <= 5; i++) {

				Iterator iterator = diccionario.keySet().iterator();

				for(int j = (int)(Math.random()*diccionario.size()); j!= 0; j--) {

					iterator.next();

				}

				palabraBuscada = (String) iterator.next();


				System.out.println("¿Cuál es la traducción de " + palabraBuscada + "?");
				String respuesta = teclado.next();

				if(respuesta.equals(diccionario.get(palabraBuscada))) {

					aciertos++;

				} else {

					fallos++;

				}
			}

			System.out.println("El númerpo de respuestas correctas es: " + aciertos);

			System.out.println("El númerpo de respuestas incorrectas es: " + fallos);


		}
}