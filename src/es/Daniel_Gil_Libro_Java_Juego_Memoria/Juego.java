package es.Daniel_Gil_Libro_Java_Juego_Memoria;

public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Interno j1 = new Interno();
		j1.setNivel();
		j1.limpiar();
		j1.limpiar();
		
		
		//System.out.println(j1.getNivel());
		//j1.limpiar();
	
		
		j1.setSerie_Ordenador();
		System.out.println(j1.getNumeros_Ordenador());
		
		j1.setNumeros_Usuario();
		System.out.println(j1.getNumeros_Usuario());*/
		
		Proceso Jugador = new Proceso();
		Jugador.setNivel();
		System.out.println(Jugador.getNivel());
		
		Jugador.setCreación();
		
	}

}
