package es.Daniel_Gil_Ejercicios;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número que será la base: "));
		int exponente = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número que será el exponente: "));
		
	    int resultado = (int)Math.pow(base, exponente);
	    
	    System.out.println("El resultado es "  + resultado);
		
		

	}

}
