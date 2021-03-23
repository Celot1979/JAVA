package es.Daniel_Gil_Ejercicios_Internet_Casting;

import javax.swing.JOptionPane;

public class Programa {
	public static void main(String[] args) {
		int num_pass = Integer.parseInt(JOptionPane.showInputDialog("Cuantas contraseñas quiere que tenga: "));
		int longi = Integer.parseInt(JOptionPane.showInputDialog("Cuanta longitud  quieres  que tenga cada una de las contraseñas: "));
		Interno OB1 = new Interno(longi, num_pass);
		System.out.println(OB1.getLongitud() + "" + OB1.getNum_Pass());
		//System.out.println(OB1.generarPassword());
		OB1.setTotal();
		}

}
