package es.DanielGil.POO.HerenciaVII_Clases_Internas_Local;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj mireloj = new Reloj();
		mireloj.ejecutarTemporizador(3000,true);
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar: ");
		

	}

}

class Reloj{
	
	public void ejecutarTemporizador(int intervalo, boolean sonido) {
		
		 class DameLaHora implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada tres segundos" + ahora);
				
				if (sonido) Toolkit.getDefaultToolkit().beep();
			}
			
			
		}
		
		
		
		
		
		ActionListener oyente = new DameLaHora();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
	}
	
	
	
	
	
	
}

