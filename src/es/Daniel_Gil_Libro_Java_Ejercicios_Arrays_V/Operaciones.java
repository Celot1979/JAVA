package es.Daniel_Gil_Libro_Java_Ejercicios_Arrays_V;

import java.util.Scanner;

public class Operaciones {
	public Operaciones() {
		for(int i = 0; i <10;i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduzca 10 número:");
			int number = entrada.nextInt();
			if (number < 0) {
				numeros_negativos[i] = number;
				
			}else if(number > 0){
				numeros_positivos[i]= number;
			}
			}
	}
			
			
		

	
	
	public String Arreglos_Positivos() {
		int posicion= 1;
		for (int j = 0; j < numeros_positivos.length; j++) {
			//System.out.println("El numero que has introduccido es: " + numeros_positivos[j] + " en la posicion: " + posicion);
			posicion ++;
		}
		
		
		return "####### Estos son los Positivos ########";
		
	}
	
	
	public String Arreglos_Negativoss() {
		int posicion= 1;
		for (int j = 0; j < numeros_negativos.length; j++) {
			//System.out.println("El numero que has introduccido es: " + numeros_negativos[j] + " en la posicion: " + posicion);
			posicion ++;
		}
		
		
		return "####### Estos son los Negativos ########";
		
	}
	
	
	public boolean setSuma_Positivos() {
		for(int k = 0; k < numeros_positivos.length; k ++) {
			sumar_positivos+= numeros_positivos[k];
		}
		return false;
	}
	
	public String getSumar_Positivos() {
		return "La suma de los números positivos son: " + sumar_positivos;
	}
	
	public boolean setSuma_Negativos() {
		for(int k = 0; k < numeros_negativos.length; k ++) {
			elemento = 0;
			resultado = 0;
			
			resultado = elemento - numeros_negativos[k];
			
			
		}
		return false;
	}
	
	public String getSumar_Negativos() {
		return "La suma de los números negativos son: " + numeros_negativos + resultado;
	}
	
	
	
	
	
	
	
	
	//Propiedades
	private int numeros[] = new int [10];
	private int numeros_negativos[] = new int [10];
	private int numeros_positivos[] = new int [10];
	private int sumar_positivos;
	private int sumar_negativos;
	private int elemento;
	private int resultado;
	
	
}