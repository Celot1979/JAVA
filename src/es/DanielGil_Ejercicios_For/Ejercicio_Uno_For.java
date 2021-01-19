package es.DanielGil_Ejercicios_For;

import javax.swing.JOptionPane;

public class Ejercicio_Uno_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Mi forma de empezar a resolver el problema es la siguiente:
		 *Comienzo con un bucle while con la condicion de si lo introduccido tiene un arroba.
		 *Si no tiene arroba, vuelvo a preguntar al usuario hasta que introduzca.
		 *Esa misma l�gica lo uso con los 4 caractares y con el punto.*/
		
		String email = JOptionPane.showInputDialog("Introdce el email, por favor");
		int arroba = 0;
		int punto = 0;
		while(!email.contains("@")) {
			System.out.println("No tiene arroba");
			email = JOptionPane.showInputDialog("Introdce el email, por favor");
		}
		
		
		for(int i= 0; i<email.length(); i++) {
			
			if(email.charAt(i)=='@') arroba++;
			
		}
		
		while (arroba>1) {
			System.out.println("Demasiadas @");
			email = JOptionPane.showInputDialog("Introdce el email, por favor");
		}
		
		
		while(email.length()<4)	{
			System.out.println("Tiene menos de 4 caracteres ");
			email = JOptionPane.showInputDialog("Introdce el email, por favor");
			
		}
		
		
         for(int i= 0; i<email.length(); i++) {
			
			if(email.charAt(i)=='.') punto++;
		}
		
        
         
		while (!email.contains(".")) {
			System.out.println("No tiene punto");
			email = JOptionPane.showInputDialog("Introdce el email, por favor");
			
		}
			
		
		System.out.println("Es correcta");	
		}
		
	}
	
	


