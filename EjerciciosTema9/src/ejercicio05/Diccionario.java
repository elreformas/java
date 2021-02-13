package ejercicio05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


	public class Diccionario {


		public static void main(String[] args) {


			HashMap<String, String> diccionario = new HashMap<String, String>();


			diccionario.put("Hola","Hello");
			diccionario.put("Caballito de mar","Seahorse");
			diccionario.put("Arco","Bow");
			diccionario.put("Lluvia","Rain");
			diccionario.put("Terremoto","Earthquake");
			diccionario.put("Fuego","Fire");
			diccionario.put("Bardo","Bard");
			diccionario.put("Monje","Monk");
			diccionario.put("Guadaña","Scythe");
			diccionario.put("Calor","Heat");
			diccionario.put("Almizcle","Musk");
			diccionario.put("Ceniza","Ash");
			diccionario.put("Amanecer","Dawn");
			diccionario.put("Zafiro","Shapphire");
			diccionario.put("Rubí","Ruby");
			diccionario.put("Esmeralda","Emerald");
			diccionario.put("Tiempo","Time");
			diccionario.put("Espacio","Space");
			diccionario.put("Diamante","Diamond");
			diccionario.put("Perla","Pearl");


			Scanner s = new Scanner(System.in);

			int correctas=0;
			int incorrectas=0;

			String palabraBuscada;

			for(int i = 1; i <= 5; i++) {

				Iterator iterator = diccionario.keySet().iterator();

				for(int j = (int)(Math.random()*diccionario.size()); j!= 0; j--) {

					iterator.next();

				}

				palabraBuscada = (String) iterator.next();


				System.out.println("¿Cuál es la traducción de " + palabraBuscada + "?");
				String respuesta = s.next();

				if(respuesta.equals(diccionario.get(palabraBuscada))) {

					correctas++;

				} else {

					incorrectas++;

				}
			}

			System.out.println("El númerpo de respuestas correctas es: " + correctas);

			System.out.println("El númerpo de respuestas incorrectas es: " + incorrectas);


		}
}