package es.DanielGil_Ejercicios_For;

import javax.swing.JOptionPane;

public class Solulicion_Ejerciico_Uno_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean valido = false;
		do {
			
			String email = JOptionPane.showInputDialog("Introduce el email");
			int arroba = 0;
			boolean punto = false;
			
			for(int i = 0; i<email.length(); i++) {
				
				if(email.charAt(i)=='@') arroba ++;
				if(email.charAt(i)=='.') punto = true;
				
				
			}
			
			if(arroba ==1 && punto == true && email.length()>=4) valido= true;
			else JOptionPane.showMessageDialog(null, "Email no valido");
			
			
			
			
			
		}while(valido == false);
		
		JOptionPane.showMessageDialog(null, "Email correcto. PERFECTO!!");

	}

}
