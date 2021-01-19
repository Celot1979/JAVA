package es.Daniel_Gil_Ejercicios_Internet;

import javax.swing.JOptionPane;

public class Ejercicio_Dos {

	public static void main(String[] args) {
		/* Haz una aplicación que calcule el área de un círculo(pi*R2).
		 *  El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
		 *   Usa la constante PI y el método pow de Math.
		 */
		
		Double radio = Double.parseDouble(JOptionPane.showInputDialog("Que radio tendra el circulo"));
		//int area = Math.PI * Math.pow(radio, s);
		//System.out.println(area);
		
		//System.out.println(radio);
		
		Double area = Math.PI * Math.pow(radio, 2);
		System.out.println(area);
		

	}

}
