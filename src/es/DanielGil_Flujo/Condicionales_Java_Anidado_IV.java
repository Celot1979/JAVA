package es.DanielGil_Flujo;

import javax.swing.JOptionPane;

public class Condicionales_Java_Anidado_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad =Integer.parseInt(JOptionPane.showInputDialog("Cual es tu edad"));
		if (edad>=18) {
			
			String carnet =JOptionPane.showInputDialog("Tienes carnet" );
			if (carnet.equals("si")) {
				JOptionPane.showMessageDialog(null,"Si puedes comprar el coche");
			}else {
				JOptionPane.showMessageDialog(null,"Sin no tienes carnet no puedes tener coche");
			}
			
		}else {
			JOptionPane.showMessageDialog(null,"Si eres menor no pudes tener carnet ni coche");
		}

	}

}
