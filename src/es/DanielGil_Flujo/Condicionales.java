package es.DanielGil_Flujo;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJEMPLO DE IF 1
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("¿Qué edad tienes? "));
		
		if(edad > 18) {
			System.out.println(" Eres mayor de edad ");
		}else if (edad < 18) {
			System.out.println("Eres menor de edad");
		}else {
			System.out.println(" Has cometido un error");
		}

	}

}
