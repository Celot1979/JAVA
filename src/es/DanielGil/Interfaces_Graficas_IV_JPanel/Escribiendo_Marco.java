package es.DanielGil.Interfaces_Graficas_IV_JPanel;

import java.awt.*;

import javax.swing.*;

public class Escribiendo_Marco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto miMarco = new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{

	public MarcoTexto() {
		setBounds(400,200,600,450);
		setTitle("Escritura en JFrame");
		setVisible(true);
		
		PrimerPanel milamina = new PrimerPanel();
		add(milamina);
	}
	
}

class PrimerPanel extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);// Esto se hace para llamar al paintComponet de la clase padre(JPanle).
		// Si no sería sobreescribirlo y el comportamiento del método sería diferente.
		g.drawString("Primer Panel", 20, 20);
	}
}