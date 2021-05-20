package es.Daniel.Interfaces_Graficas_IX_Fuentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Tipo_Letra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFuente mimarco = new MarcoFuente();

	}

}


class MarcoFuente extends JFrame{
	public MarcoFuente() {
		setBounds(300,300,800,400);
		LaminaFuente milamina = new LaminaFuente();
		add(milamina);
		setVisible(true);
		
	}
}


class LaminaFuente extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		
		Font miletra = new Font("Courier new", Font.BOLD, 26);
		
		g2.setFont(miletra);
		
		g2.setPaint(Color.BLUE);
		
		g2.drawString("Prueba de las tipografias", 100, 100);
		
		
	}
}