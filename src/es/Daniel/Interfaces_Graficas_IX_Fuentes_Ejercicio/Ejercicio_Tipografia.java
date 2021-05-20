package es.Daniel.Interfaces_Graficas_IX_Fuentes_Ejercicio;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Ejercicio_Tipografia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFuente miMarco = new MarcoFuente();
		

	}

}

class MarcoFuente extends JFrame{
	public MarcoFuente() {
		setBounds(300,300,800,400);
		LaminaFuerte milamina = new LaminaFuerte();
		add(milamina);
		setVisible(true);
	}
}

class LaminaFuerte extends JPanel{
	public LaminaFuerte() {
		FuenteElegida = JOptionPane.showInputDialog("Qué tipografia quieres usar: ");
		letraPresente = false;
		misFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); 
		
	}
	
	public void paintComponet(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		Font miLetra;
		for (String nombreFuente : misFuentes)  {
			if(nombreFuente.equals(FuenteElegida)) letraPresente = true;
		}
		
		if(letraPresente) miLetra=new Font(FuenteElegida,Font.BOLD,20);
		else {
			g2.setPaint(Color.RED);
			g2.drawString("No existe esa fuente.Se escribirá en ARIAL", 10, 10);
			miLetra = new Font("Arial", Font.BOLD,20);
		}
		
		g2.setFont(miLetra);
		g2.setPaint(Color.BLUE);
		g2.drawString("Text de prueba", 100, 100);
	}
	private String FuenteElegida;
	boolean letraPresente;
	String[] misFuentes;
}
