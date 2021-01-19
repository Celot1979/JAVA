package es.DanielGil_Flujo;

import javax.swing.JOptionPane;

public class Condicionales_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int beca = Integer.parseInt(JOptionPane.showInputDialog(" RENTA "));
		int distancia = Integer.parseInt(JOptionPane.showInputDialog(" DISTANCIA "));
		
		if (beca<20000 && distancia < 10) {
			System.out.println(" Tiene derecho a beca");
			
		}else {
			System.out.println(" No tiene derecho a beca");
		}

	}

}
