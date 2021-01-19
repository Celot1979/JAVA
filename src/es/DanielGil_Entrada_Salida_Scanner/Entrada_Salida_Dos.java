package es.DanielGil_Entrada_Salida_Scanner;

import java.util.Scanner;

public class Entrada_Salida_Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Vamos a cálcular la suma de dos números ");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introducce un número: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Introducce un número: ");
		int num2 = entrada.nextInt();
		
		System.out.println("La suma de ambos númereos son: " + (num1+num2));
		entrada.close();

	}

}
