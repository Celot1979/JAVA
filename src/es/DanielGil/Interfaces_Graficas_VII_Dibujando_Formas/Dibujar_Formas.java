package es.DanielGil.Interfaces_Graficas_VII_Dibujando_Formas;

import java.awt.*;

import javax.swing.*;

public class Dibujar_Formas {

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
		g.setColor(Color.blue);
		g.drawRect(20, 20, 125, 75);
		g.drawLine(20, 20, 145, 95);
		g.drawRoundRect (250, 70, 50, 70, 6, 6);
		g.drawOval (350, 70, 50, 70);
		int [] vx1 = {500, 550, 450};
		int [] vy1 = {70, 120, 120};
        g.drawPolygon (vx1, vy1, 3);
        
        
        g.setColor (Color.red);
        g.fillRect (150, 270, 50, 70);//Pinta su interior
        g.fillRoundRect (250, 270, 50, 70, 6, 6);//Pinta su interior
        g.fillOval (350, 270, 50, 70);
        int [] vx2 = {500, 550, 450};
        int [] vy2 = {270, 320, 320};
        g.fillPolygon (vx2, vy2, 3);
		
	}
}