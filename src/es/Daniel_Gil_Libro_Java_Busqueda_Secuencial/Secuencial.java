package es.Daniel_Gil_Libro_Java_Busqueda_Secuencial;

import java.util.Scanner;

public class Secuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arreglo[], nElementos, aux;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cúantos elementos quieres que tenga el arreglo: ");
		nElementos = entrada.nextInt();
		
		arreglo= new int[nElementos];
		
		for(int i = 0; i < (nElementos - 1); i++) {
			Scanner entrada2 = new Scanner(System.in);
			System.out.println("Introducce los números que quieres que formen parte del array: ");
			arreglo[i]=entrada2.nextInt();
		}
		
		System.out.println("Arreglo sin ordenar: ");
		for(int i = 0; i < nElementos; i++) {
			System.out.print(arreglo[i] + " ");
		}
		//##############################################################################################################################################
		//##############################################################################################################################################
		//Ordenamiento
		//##############################################################################################################################################
		for(int i = 0; i < (nElementos -1); i++) {
			for(int j = 0; j < (nElementos - 1); j++) {
				if(arreglo[j] > arreglo[j + 1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
						}
						
						
					}
				}
				
		System.out.println("\nArreglo Ordenado: ");
		for(int i = 0; i < nElementos; i++) {
			System.out.print(arreglo[i] + " ");
				}
				
	    //##############################################################################################################################################
	   // Busqueda secuencial
		int dato;
		boolean band = false;
				
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("\nQué número deseas buscar: ");
		dato = entrada3.nextInt();
		int i = 0;
		while(i < nElementos && band == false) {
			if (arreglo[i] == dato) {
				band = true;
				}else {
					band = false;
				}
				i++;
				}
				
				
	    if (band == true) {
	    	System.out.println("El número buscado fue encontrado en la posición " + (i-1));
	    	}else {
	    		System.out.println("El número buscado no se encuentra en el array");
				}
				
			}

		}
		
