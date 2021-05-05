package es.DanielGil.Interfaces_Graficas_VI_Simplificando_Codigo;

import java.awt.*;

import javax.swing.*;

public class Tipografias_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto miMarco = new MarcoTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{// Crear ventana

	public MarcoTexto() {
		setBounds(400,200,600,450);
		setTitle("Escritura en JFrame");
		setVisible(true);
		
		PrimerPanel milamina = new PrimerPanel();
		add(milamina);
	}
	
}

class PrimerPanel extends JPanel{// Crear Lamina o contenedor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);// Esto se hace para llamar al paintComponet de la clase padre(JPanle).
		// Si no sería sobreescribirlo y el comportamiento del método sería diferente.
		
		
		// Esta opción es para determinar el color que tendrá el texto
		
		Color miColor = new Color(153,153,255);
		g.setColor(miColor);
		
		// Cambiar el tipo de letra
		Font miletra = new Font("Verdana", Font.BOLD, 24);
		g.setFont(miletra);
		
		//Para escribir en la lámina
		g.drawString("Primer Panel", 200, 200);
	}
}

