package es.DanielGil_Flujo;

import javax.swing.JOptionPane;

public class Condicionales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = Integer.parseInt(JOptionPane.showInputDialog(" Qué edad tienes "));
		
		if (edad < 18) {
			System.out.println("Eres un niño");
		}else if (edad > 18 || edad < 40) {
			System.out.println("Eres un Joven Adulto");
		}else if (edad > 41 || edad < 60) {
			System.out.println("Eres un Adulto");
		}else {
			System.out.println("Eres un anciano");
		}

	}

}
