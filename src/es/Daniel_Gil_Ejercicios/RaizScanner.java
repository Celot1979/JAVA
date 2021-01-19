package es.Daniel_Gil_Ejercicios;

import java.util.Scanner;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número, por favor: ");
		int numero = entrada.nextInt();
		entrada.close();
		
		double raiz = Math.sqrt(numero);
		
		System.out.println("La raiz cuadra es " + raiz);
		
		

	}

}
