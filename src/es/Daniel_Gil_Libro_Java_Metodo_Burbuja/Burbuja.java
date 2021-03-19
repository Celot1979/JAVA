package es.Daniel_Gil_Libro_Java_Metodo_Burbuja;

import java.util.Scanner;

public class Burbuja {

	public static void main(String[] args) {
		// Bubble
		
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
		
		
		
		for(int i = 0; i < (nElementos); i++ ) {
			for(int j = 0; j < (nElementos - 1); j++) {
				aux = arreglo[j];
				arreglo[j] = arreglo[j + 1];
				arreglo[j + 1] = aux;
			}
		}
		
		
		
		
		System.out.println("Sort method Bubble");
		
		for(int i =0; i < nElementos;i++) {
			System.out.print(arreglo[i] + " ");
		}

	}

}
