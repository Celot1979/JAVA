package es.Daniel_Gil_Ejercicios_Array;

import java.util.Scanner;

public class Primer_Ejercicio_Array {

	public static void main(String[] args) {
		/*En este ejercicio se pide al usuario que introduzca 10 números
		 *enteros por consola. Los números introducidos se almacenarán 
		 *en un array.
		 *El programa imprime en consola cuántos números negativos,
		 *positivos y valores 0 hay en el array.
		 */
		int i;
        int[] numeros = new int[5];

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<numeros.length; i++)
        {
            System.out.printf("Introduzca n�mero : ", i+1);
            numeros[i] = teclado.nextInt();
        }

        for(i=0; i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
		
		
		
		
		
		

	}	}


