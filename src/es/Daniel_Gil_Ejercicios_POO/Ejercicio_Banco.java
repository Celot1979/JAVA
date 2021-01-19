package es.Daniel_Gil_Ejercicios_POO;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio_Banco {

	public static void main(String[] args) {
		
		
		// Preguntar datos de 1ª Cuenta por JOptionPane

		
		String nombre1 = JOptionPane.showInputDialog("Escribe tu nombre, por favor");
		int dinero1 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
		
		

		// Preguntar datos de 2ª Cuenta por JOptionPane
		
		String nombre2 = JOptionPane.showInputDialog("Escribe tu nombre, por favor");
		int dinero2 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
		
		//-----------------------------------------------------------------------------
		// Cuenta numero dos

		Cuenta Cuenta1= new Cuenta(nombre1 , dinero1);
		
		
		//System.out.println(Cuenta1.getIngresos());
		
		//Cuenta1.setIngresos(200);
		
		//Cuenta1.setIngresos(300);
		
		//Cuenta1.setReitegro(100);
		
		
		//System.out.println(Cuenta1.getIngresos());
		//System.out.println(Cuenta1.getReitegro());
		//System.out.println(Cuenta1.getDatos());
		
		//-----------------------------------------------------------------------------
		// Cuenta numero dos
		Cuenta Cuenta2= new Cuenta(nombre2, dinero2);
		//System.out.println(Cuenta2.getIngresos());
        //Cuenta2.setIngresos(800);
		
		//Cuenta2.setIngresos(40000);
		
		//Cuenta2.setReitegro(500);
		
		//System.out.println(Cuenta2.getReitegro());
		//System.out.println(Cuenta2.getDatos());
		
		//-----------------------------------------------------------------------------
		// Transferir dinero de una cuenta a otra
		Scanner pregunta = new Scanner(System.in);
		System.out.println("A que cuenta quieres transferir: ");
		int opcion = pregunta.nextInt();
		pregunta.close();
		if (opcion == 1) {
			int tra1 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
			Cuenta2.setReitegro(tra1);
			Cuenta1.setIngresos(tra1);
			System.out.println(Cuenta1.getDatos());
			System.out.println(Cuenta2.getDatos());
			
			
			
		}else if (opcion == 2) {
			int tra2 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));
			Cuenta1.setReitegro(tra2);
			Cuenta2.setIngresos(tra2);
			System.out.println(Cuenta1.getDatos());
			System.out.println(Cuenta2.getDatos());
		}

	}
   
}
