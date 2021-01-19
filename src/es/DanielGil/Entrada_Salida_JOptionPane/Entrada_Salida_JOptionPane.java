package es.DanielGil.Entrada_Salida_JOptionPane;
import javax.swing.*;
public class Entrada_Salida_JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Escribe tú nombre, por favor");
		int edad = Integer.parseInt(JOptionPane.showInputDialog(" tu edad"));
		/* La clase Integer con el método parserInt es para convertir un String
		 * en un entero
		 * */
		 
		System.out.println("Tu nombre es " + nombre + " la edad es " + edad);
		
		

	}

}
