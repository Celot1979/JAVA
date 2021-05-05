package es.DanielGil.Interfaces_Graficas_EJERCICIO_I;
import javax.swing.*;
public class Primer_JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame miVentana = new JFrame();
		// Tamaño (En pixeles).
		miVentana.setSize(600, 350);
		
		
		
		// Donde queremos que aparezca la ventana
		
		miVentana.setLocation(600, 350);
	    // Tenemos que decirle al sistema que debe de hacer
		// con la ventana cuando terminemos con ella.
		//También podemos usar el valor númerico de la constante
		//miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //miVentana.setDefaultCloseOperation(0);
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Tenemos que darle visibilidad.
		//Importante. Siempre se pone al final.
				miVentana.setVisible(true);
	}

}
