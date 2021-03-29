package es.Daniel_Gil_Libro_Java_Ejercicios_Arrays_V;

import java.util.Scanner;

public class Operaciones {
	public Operaciones() {
		
		
		numeros = new int[10];
		numeros_negativos= new int[10];
		numeros_positivos= new int[10];
		
		for (int i =0; i < numeros.length;i++) {
			Scanner n = new Scanner(System.in);
			System.out.println("Introduce 10 números: ");
			int num = n.nextInt();
			numeros[i]= num;
			if (num < 0){
				this.numeros_negativos[i]= num;
			}else {
				this.numeros_positivos[i]= num;
			}
			
		}
		
		
		
	}
	
	
	public void mostrarArrays() {
		
		int posicion  =0;
		for(int j = 0; j < numeros.length; j++) {
			posicion = j;
			System.out.println("Elemento de array : " +numeros[j] + " indice : "+ posicion);
		}
	}
	
	public void Negativos() {
		int posicion2= 0;
		for(int j = 0; j < numeros_negativos.length; j++) {
			posicion2 = j;
			System.out.println("Los elementos del array negativos son: " +numeros_negativos[j] + " indice : "+ posicion2);
		}
		
	}
	
	
	public void Positivos() {
		int posicion3= 0;
		for(int j = 0; j < numeros_positivos.length; j++) {
			posicion3 = j;
			System.out.println("Los elementos del array positivo son: " +numeros_positivos[j] + " indice : "+ posicion3);
		}
		
	}
	
	
	
	
	
	private int numeros[];
	private int numeros_negativos[];
	private int numeros_positivos[];

}
