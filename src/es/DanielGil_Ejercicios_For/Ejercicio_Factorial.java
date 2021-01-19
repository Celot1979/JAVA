package es.DanielGil_Ejercicios_For;

import java.util.Scanner;

public class Ejercicio_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*En esté ejercicio vamos a pedir al usuario que nos de un número 
	      y calcular el factorial del mismo.
		 La lógica es que por cada pasada del bucle, se reste uno.Ese nuevo número
		 se multiplicará por el factorial anterior y así sucesivamente*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int numero = entrada.nextInt();
		
		int factorial=1;
		int numero_Uno= numero;
		
		while(numero!= 0) {
			
			factorial *= numero;
			numero --;
		}
		
		System.out.println("El número que el usuario a introduccido es: " + numero_Uno + " y su factorial es " + factorial);
				
		

	}

}
