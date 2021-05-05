package es.DanielGil.Interfaces_Graficas_III_Cambiar_Imagen_Ventana;
import javax.swing.*;
public class Primer_JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miJFrame miventana = new miJFrame();
	
	}

}
class miJFrame extends JFrame{
	public miJFrame() {
		setSize(600,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(600, 350);
		setVisible(true);
	}
}