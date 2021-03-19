package es.Daniel_Gil_Libro_Java_Metodo_Seleccion_Directa;

import java.util.Scanner;

public class Seleccion_Directa {

	public static void main(String[] args) {
		// Insertion sort
		
		int arreglo[], nElementos, pos, aux;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Number of elements in the ARRAY?Y");
		nElementos= entrada.nextInt();
		
		
		arreglo = new int[nElementos];
		
		for(int i = 0; i < nElementos; i++) {
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Digitize number to number:");
			arreglo[i]= entrada2.nextInt();
		}
		
		
		for(int i = 0; i < nElementos; i++){
			pos = i;
			aux = arreglo[i];
			while((pos > 0) && (arreglo[pos - 1] > aux)) {
				arreglo[pos] = arreglo[pos-1];
				pos--;
			}
			
			arreglo[pos] = aux;
		}
		
		System.out.println("Insertion sort");
		for(int j =0; j < nElementos; j++) {
			
			System.out.print(arreglo[j] + " ");
		}
		

	}

}
