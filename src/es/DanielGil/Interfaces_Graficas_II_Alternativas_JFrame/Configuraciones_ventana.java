package es.DanielGil.Interfaces_Graficas_II_Alternativas_JFrame;
import java.awt.Frame;

import javax.swing.*;
public class Configuraciones_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miJFrame miventana = new miJFrame();
	
	}

}
class miJFrame extends JFrame{
	public miJFrame() {
		//setSize(600,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocationRelativeTo(null);//Se abre la ventana en 
		// el centro del monitor
		setBounds(600,350,450,450);
		/* Con el metodo Bounds podemos dejar de usar el
		 * método setSize y el método setLocation.
		 */
		//setResizable(false);
		/* El método setResizable(false) sirve para que
		 * no se pueda redimensionar el Jframe
		 */
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Ventana de pruebas");
		setVisible(true);
	}
}