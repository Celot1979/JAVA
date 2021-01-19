package es.DanielGil.POO;

public class UsoVehiculos {

	public static void main(String[] args) {
		// Creamos un programa con clases
		// 6ª Aquí es donde crearemos las sentencias para hacer funcionar
		// la clase Vehuculos
		
		Vehiculos miCoche = new Vehiculos(4);
		
		// Como se puede acceder al método perteneciente a un ojeto
		
		miCoche.setColor("Naranja");
		//System.out.println(miCoche.getColor());
		
		
		Vehiculos miCoche2 = new Vehiculos(4);
		
		miCoche2.setColor("Violeta");
		//System.out.println(miCoche2.getColor());
	
		Vehiculos miMoto = new Vehiculos(2);
		
		
		System.out.println(miCoche.getDatosVehiculo());
		System.out.println(miMoto.getDatosVehiculo());
		
		
		//Sentencia de prueba del método sobrecargado de climatizador
		
		//miCoche2.setExtra(true);
		/* en esatá sentencia Java reconoce al 1º método del setter (setExtra) porque sólo tiene un parámetro, sí escribieramos
		 * los tres parámetros de el 2º setter (true, false, false), reconocería a ése métedo. Cada una de las respuestas
		 * booleanas iría en orden
		 */
		
		miCoche2.setExtra(false, true, false);
		/* En la segunda parte del sobregarga video 44, hemos modificado en el archivo vehiculos.java
		 * el setters de sobrecarga y el getters con la nueva lógica.
		 * ahora debemos llamar al médotodo setExtra. Si nos fijamos una vez que escribimos setExtra
		 * nos sale un desplegable que nos da a elegir entre dos setters, el simple con climatizador 
		 * el compuesto con las tres opciones.
		 * Elegimos la de 3 opciones y en los parametros nos da a elgir, si true o false en cada uno
		 * de los parametros.
		 */
		
		
		System.out.println(miCoche2.getExtra());
		
		
		Vehiculos miMoto2 = new Vehiculos(2,1,0.3,200);
		miMoto2.setColor("gris");
		
		Vehiculos miCamion = new Vehiculos(6,3,1.5,3500);
		
		miCamion.setColor("azul");
		miCamion.setExtra(true, true, true);
		System.out.println(miCamion.getExtra());
		
		
	
		
		

	}

}
