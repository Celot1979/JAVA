package es.DanielGil.Interfaces_Graficas_I;
import javax.swing.*;
public class EJERCICIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana v1 = new Ventana("Ventana 1", 300,300);
		Ventana v2 = new Ventana("Ventana 2", 600,400);
		Ventana v3 = new Ventana("Ventana 3", 900,500);
	}

}

class Ventana extends JFrame{
	/**Author Daniel Gil
	 * Aún no estamos en disposición de entender la serenizacións
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana(String titulo, int locX, int locY) {
		
		setTitle(titulo);
		setSize(600,350);
		setLocation(locX,locY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
