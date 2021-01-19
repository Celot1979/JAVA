package es;

import java.util.Scanner;

public class Repetir_ejer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);// Iniciamos la sentencia para luego poder preguntar
		int aleatorio = (int)(Math.random()+100);// Fórmula para poder realizar números aleatorios
		int intentos = 0;
		int numero = 0;
		
		while(aleatorio!=numero) {
			intentos++;
			System.out.println("Introduce un numero");
			numero=entrada.nextInt();
			if (aleatorio > numero) {
				intentos++;
				System.out.println("El número es menor que el aleatorio");
			}else if (aleatorio<numero) {
				intentos++;
				System.out.println("El número es mayor que el aleatorio");

				
			}
			
		}
		
		System.out.println("Este es el número BRAVO!!! " + "has logrado en" + intentos );

	}

}
