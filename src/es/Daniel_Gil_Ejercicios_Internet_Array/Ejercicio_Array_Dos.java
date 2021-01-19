package es.Daniel_Gil_Ejercicios_Internet_Array;

import java.util.Scanner;

public class Ejercicio_Array_Dos {

	public static void main(String[] args) {
		/*Crea un array de números donde le indicamos por teclado el tamaño del array, 
		 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores.
		 *  
		 *  Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), 
		 *  para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
		 */
		
		
		int i = 0;
		int suma=0;
		//Se crea una variable para almacenar la suma de los elementos del array que posteriormente se realizará la operación.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cantidad de arrays ");
		int num = entrada.nextInt();
		int [] array = new int [num];
		/* Después de estás 5 líneas de código, hemos creado un array con un número de elementos que pasamos por consola*/
		
		
		
		for(i = 0; i < array.length;i++) {
			array[i]= (int)(Math.random()* num);
			
			//En este bucle FOR creamos aleatorioamente cada elemento que forma parte del array con el método random.
			//al final del método multiplicamos por el numero que hemos dado por consola para que sepa cuantos elementos crear.
		}
        
		for (i = 0; i < array.length; i++) {
			
			System.out.println("Los numeros introduccidos son " +array[i] + " los indices son " + i);
			
			//Finalmente imprimimos por consola los elementos del array y el valor de cada posición.
		}
		for (i = 0; i < array.length; i++) {
			
			suma = suma + array[i];
			
			
		}
		System.out.println("La suma de los arrays son: " + suma);
	}

}
