package es.DanielGil.Interfaces_Graficas_VIII_Colores;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;
public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoDibujos miMarco = new MarcoDibujos();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoDibujos extends JFrame{
	public MarcoDibujos() {
		setBounds(300,300,800,400);
		LaminaDibujos milamina = new LaminaDibujos();
		add(milamina);
		setVisible(true);
		
	}
}

class LaminaDibujos extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		
		Rectangle2D rectangulo = new Rectangle.Double(100,100,200,150);
		
		
		float midash[]= {10.0f};
		BasicStroke miLapiz = new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10,midash,0);
		//Método 1º para dar color a las formas que tengamos en la lámina.
		
				g2.setPaint(java.awt.Color.BLUE);
				
	   //Método 2º para dar color. Crear un objeto de color, posteriormente se pasa por parámetro.
				
				/*Color mColor = new Color(130, 200, 90);
				
				g2.setPaint(mColor);*/
				
				
				/* Con la clase JPanel también se pueden usar estos dos métodos para dar color de fondo
				 */
				
				//g2.setBackground(Color.BLUE);		
		
		g2.setStroke(miLapiz);	
		
		
		
		
		
		g2.draw(rectangulo);
		
		g2.setPaint(java.awt.Color.RED);
		
		g2.fill(rectangulo);
		
	}
}