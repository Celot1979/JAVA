package es.Daniel_Gil_Ejercicios_Internet;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio_diez {

	public static void main(String[] args) {
		/* Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), 
		 * después muestra ese número por consola.
		 */
		int codigo = 0;
		Scanner entrada = new Scanner(System.in);
		do {
			
			System.out.println("Que número");
			
			codigo = entrada.nextInt();
			
		}while(codigo <= 0);
		System.out.println(codigo);
		
		
	}
}
