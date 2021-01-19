package es.DanielGil_Entrada_Salida_Scanner;

import java.util.Scanner;

public class Entrada_Salida_Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qué quieres");
		String nombre = entrada.nextLine();
		System.out.println("El usuario quiere.... " + nombre);
		entrada.close();

	}

}
