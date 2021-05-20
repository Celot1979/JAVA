package es.Daniel.Interfaces_Graficas_IX_Fuentes;

import java.awt.GraphicsEnvironment;

public class Letras_En_Local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] misFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String nombreFuente: misFuentes) {
			System.out.println(nombreFuente);
		}

	}

}
