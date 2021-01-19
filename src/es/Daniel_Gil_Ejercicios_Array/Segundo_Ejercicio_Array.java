package es.Daniel_Gil_Ejercicios_Array;

import java.util.Scanner;

public class Segundo_Ejercicio_Array {

	public static void main(String[] args) {
		/*En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. 
		 *Los números se almacenarán en un array y el programa calculará la media de los números introducidos en las posiciones pares del array. 
		 *(Debes utilizar el operador módulo “%”).
		 */
		int i ;
		
		int []numeros = new int[10];
		
		int suma = 0;
		int numero = 0;
		int sumaTotal = 0;
		int media = 0;
		int numeros_pares= 0;
		
		
	    Scanner teclado = new Scanner(System.in);
	    
	    for ( i = 0; i < numeros.length; i++) {
	    	System.out.printf("Introducce los 10 numeros ", i+1);
	    	numeros[i]= teclado.nextInt();
	    	
	    }
	    
	    for(i = 0; i < numeros.length; i++) {
	    	if(numeros[i]% 2 == 0  ) {
	    		
	    		numeros_pares ++;
	    		sumaTotal = sumaTotal + numeros[i];
	    		//Calculo de la suma de los pares
	    		
	    		media = sumaTotal / numeros_pares;
	    		
	    	}
	    	
	    
	    }
	    
	    
	    
	   
		
		System.out.println(sumaTotal);
		System.out.println(media);
		
		
	
		
		
        
	}

}
