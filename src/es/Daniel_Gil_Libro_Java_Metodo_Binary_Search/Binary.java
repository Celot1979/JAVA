package es.Daniel_Gil_Libro_Java_Metodo_Binary_Search;

import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		// En este archivo trabajaremos tanto el medor sort(ordenación de un array). Luego aplicaremos el método binary search para encontrar
		// el número solicitado
		
		int serie []= new int[] {34,56,7,6,3,2,1,5,7,8,9};
		
		Arrays.sort(serie);
		int saber = Arrays.binarySearch(serie, 8);
		System.out.println("La posición del numero 1 está en: " + saber);

	}

}
