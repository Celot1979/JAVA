package es.Daniel_Gil_Ejercicios_Internet_Array;

import java.util.Scanner;

public class Ejercicio_Array_Uno {

	public static void main(String[] args) {
		/*Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde. 
		 * Haz dos métodos, uno para rellenar valores y otro para mostrar.
		 */
		
		int i;
        int[] numeros = new int[10];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca los numeros, por favor : ", i+1);
            numeros[i] = teclado.nextInt();
        }
        
        for(i=0; i<numeros.length; i++) {
        	System.out.println(i);
        }

        for(i=0; i<numeros.length; i++)
        {
            System.out.println("Los numeros introduccidos son " + numeros[i] + " los indices son " + i);
        }
		

	}

}
