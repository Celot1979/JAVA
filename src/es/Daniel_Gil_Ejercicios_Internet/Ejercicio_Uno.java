package es.Daniel_Gil_Ejercicios_Internet;

import javax.swing.JOptionPane;

public class Ejercicio_Uno {

	public static void main(String[] args) {
		/*Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. 
		 * Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
		 * Modifica la aplicación anterior, para que nos pida el nombre que queremos 
		 * introducir (recuerda usar JOptionPane).
		 */
		
		String nombre = JOptionPane.showInputDialog("Cual es tú nombre");
		System.out.println("Bienvenido " + nombre);

	}

}
