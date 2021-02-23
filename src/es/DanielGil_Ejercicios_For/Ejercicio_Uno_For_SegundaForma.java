package es.DanielGil_Ejercicios_For;

import javax.swing.JOptionPane;



public class Ejercicio_Uno_For_SegundaForma {

	private static int arroba;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass = JOptionPane.showInputDialog("Introduccce tu contraseña");
		
		int tope = 5;
		
		for(int i= 0; i<pass.length();i++) {
			//System.out.println(i);
			int arroba = 0;
			if(pass.charAt(i)==0)arroba++;	
	}
		
		
		if (arroba == 1) {
			System.out.println(pass);
		}else {
			System.out.println("Error en el sistema");
		}

}
}
