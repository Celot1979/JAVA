package es.DanielGil.POO.HerenciaVII_Interfaces_IV_Uso_API_ActionListener_II;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Timer miTemporizador = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Date horaActual = new Date();
				System.out.println(horaActual);
				
			}
			
		});
		miTemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");

	}

}

