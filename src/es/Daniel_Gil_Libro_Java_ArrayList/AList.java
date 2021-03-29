package es.Daniel_Gil_Libro_Java_ArrayList;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {
		// Si el array va a ser con elementos enteros de constuye de la sigueinte forma:
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		/* 1º Se invoca a la líbrería para hacer uso del método.
		 * 2º Integer se una para decir al programa que será númros enteros lo que se almacene.
		 * 3º listaNumeros es el nombre del Arraylist
		 * 4º Se realiza un NEW como un array normal y se vuelve a usar la fórmula de principio.
		 * OJO!!! hay que terminar con unos guiones.
		 */
		
		
		// Vamos a creaar una arraylist con el método random para comprobar el uso
		
		for(int i =0; i< 1000; i++) {
			listaNumeros.add((int)(Math.random()*500));
		
		}
		
		
		for(int i = 0; i < listaNumeros.size();i++) {
			System.out.println(listaNumeros.get(i));
		}

	}

}
