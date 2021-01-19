package es.Daniel_Gil_Ejercicios_Array;

import java.util.Scanner;

public class Teercer_Ejercicio_Array {

	public static void main(String[] args) {
		/* En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las posiciones un nº aleatorio entre 1 y 100. 
		 * El programa debe imprimir en consola todos los valores almacenados en el array. Utiliza un bucle for-each para leer los valores almacenados. 
		 * (Debes utilizar el método random() de la clase Math).
		 */
		
		
		int i;
        int[] numeros = new int[100];

        Scanner teclado = new Scanner(System.in);
        
        
        for (i = 0; i < numeros.length; i++) {
        	
        	numeros[i]= (int) (Math.random() * 100);
        }
        
        
        
        for (int elementos:numeros) {
        	
        	System.out.println(elementos);
        }

	}

}
