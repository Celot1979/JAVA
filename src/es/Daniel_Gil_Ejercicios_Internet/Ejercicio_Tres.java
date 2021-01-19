package es.Daniel_Gil_Ejercicios_Internet;

import javax.swing.JOptionPane;

public class Ejercicio_Tres {

	public static void main(String[] args) {
		// Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
		
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero, por favor"));
		if(numero % 2 == 0) {
			System.out.println("Es divisible entre 2");
		}else {
			System.out.println("No es divisible entre 2");
		}

	}

}
