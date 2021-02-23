package es.Daniel_Gil_Libro_Java_Ruleta;

import java.util.Scanner;

public class Ruleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interno ej = new Interno();
		
		//System.out.println(ej.getElegido());
		ej.setJugada_Maquina();
		
		ej.setApuesta();
		
		System.out.println(ej.getNumero_Ruleta());
		
		

	}

}
