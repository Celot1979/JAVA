package es.Daniel_Gil_Libro_Java_Dados;

import java.util.Scanner;

public class Tiradas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Proceso j1 = new Proceso();
		System.out.println(j1.getDeposito());
		
		j1.setApuesta();
		
		j1.setTiradas();
		System.out.println(j1.getTiradas());
		j1.setJugadas();
		System.out.println(j1.getJugadas());
		
		int opcion = 1;
		
		while (opcion ==1) {
			Scanner op1 = new Scanner(System.in);
			System.out.println("Deseas Seguir jugando: ");
			int opciones = op1.nextInt();
			
			if(opciones == 1) {
				j1.setApuesta();
				j1.setTiradas();
				System.out.println(j1.getTiradas());
				j1.setJugadas();
				System.out.println(j1.getJugadas());
			}else if (opciones == 2) {
				System.out.println("Gracias por tu visita. Esparamos volver a verte pronto.");
				opcion = 2;
				
			}
			
		}
		
	
		
	}

}
