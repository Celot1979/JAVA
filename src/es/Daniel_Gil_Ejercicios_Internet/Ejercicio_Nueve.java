package es.Daniel_Gil_Ejercicios_Internet;

import java.util.Scanner;

public class Ejercicio_Nueve {

	public static void main(String[] args) {
		/* Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
		Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Cuantas ventas se van a producir");
		int ventas = entrada.nextInt();
		
		//System.out.println(ventas);
		int suma = 0;
		for (int i = 0; i < ventas; i++) {
			
			
			Scanner entrada_dos = new Scanner(System.in);
			System.out.println("Cuanto cuesta el producto");
			suma = entrada_dos.nextInt();
			
			
			
			
		}
		
		
	    System.out.println(suma + suma);
		

	}

}
