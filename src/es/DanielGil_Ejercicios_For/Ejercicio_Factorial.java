package es.DanielGil_Ejercicios_For;

import java.util.Scanner;

public class Ejercicio_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*En est� ejercicio vamos a pedir al usuario que nos de un n�mero 
	      y calcular el factorial del mismo.
		 La l�gica es que por cada pasada del bucle, se reste uno.Ese nuevo n�mero
		 se multiplicar� por el factorial anterior y as� sucesivamente*/
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero");
		int numero = entrada.nextInt();
		
		int factorial=1;
		int numero_Uno= numero;
		
		while(numero!= 0) {
			
			factorial *= numero;
			numero --;
		}
		
		System.out.println("El n�mero que el usuario a introduccido es: " + numero_Uno + " y su factorial es " + factorial);
				
		

	}

}
