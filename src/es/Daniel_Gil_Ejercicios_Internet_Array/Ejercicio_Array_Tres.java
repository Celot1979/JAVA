package es.Daniel_Gil_Ejercicios_Internet_Array;

import java.util.Scanner;

public class Ejercicio_Array_Tres {

	public static void main(String[] args) {
		/* Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados,
		 * por último nos indica cual es el mayor de todos.
		   Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.*/
		
		
		int i = 0;
		Scanner elementos =  new Scanner(System.in);
		System.out.println("Cuantos elementos tendrá el array?: ");
		int ele= elementos.nextInt();
		int [] array = new int[ele];
		
		for(i=0; i< array.length; i++) {
			
			array[i]= (int)(Math.random()*ele);
			if (array[i]% 2 !=0) {
				
				System.out.println("Los numeros primos son: " + array[i]);
			}
		}

	}

}
