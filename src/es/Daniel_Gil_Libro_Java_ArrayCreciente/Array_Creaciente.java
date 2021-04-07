package es.Daniel_Gil_Libro_Java_ArrayCreciente;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Array_Creaciente {

	public static void main(String[] args) {
		int arreglo[], nElementos = 100, pos, aux, valor =0, aleatorio;
	
		arreglo = new int[nElementos];
		
		while(valor < 100) {

			for (int i = 0; i < 100; i++) {
				aleatorio = (int)(Math.random()*100+1);
				arreglo[i] = aleatorio;
			}

			valor++;
		}
		
		//Hasta aquí hemos sacado un array con 10 números aleatorios

		
		
		
         // Creado el array ordenado(Después de 15000000 pruebas)
		
		
		
		
         Arrays.sort(arreglo);
		
		for(int i : arreglo) {
			
			System.out.print(i + " ");
		}
		
		
  }
	

    /*Tenemos que buscar la fórmula para que al salir aleatorio el arreglo no se repitan sus números.
     * Hemos conseguido que se pueda ordenar.
     */
	
}
