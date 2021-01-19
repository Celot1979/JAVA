package es.DanielGil.Bucle;

import javax.swing.JOptionPane;

public class Bucle_Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave = "Dani";
		
		String acceso = "";
		
		while(!clave.equals(acceso)) {
			acceso = JOptionPane.showInputDialog("Introducce la clave de acceso, por favor");
			if(!clave.equals(acceso)){
				System.out.println("La clave es incorrecta");
			}
		}
		System.out.println("Bienvenido a la zona de usuarios");
        
	}

}
