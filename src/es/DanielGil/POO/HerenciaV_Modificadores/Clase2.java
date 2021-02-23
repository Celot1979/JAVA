package es.DanielGil.POO.HerenciaV_Modificadores;

public class Clase2  { 
	// Vamos hacer que clase 2 sea subclase de 1
	/*
	 * Como hemos heredado de la clase 1, hemos creado una subclase. Con
	 *  el modificador de clase Proteted, esto se puede realizar.
	 *  
	 *  Si no heredas de la clase 1, estás obligado a crear un objeo d ela clase 1 
	 *  en la clase 2 para que funcione. Para eso, lo que vamos hacer es quitar la palabra 
	 *  "extends" y clase 1, para converir nuevamente la clase 2 en forma
	 *  normal.
	 *  A continuación vamos a crear un objeto de la clase 1 en la clase 2.
	*/
	
	
	//Clase1 obj = new Clase1();
	
	//String mimensaje = obj.mensaje;
	
	
	/*El ejemplo anterior es con el modificador PROTETED. Si cambiasemos en la 
	 * clase1 el modificador a PRIVATE ya no sería lo mismo. Es mucho más
	 * restictivo.
	 * 
	 */

	
	
	/* Vamos a usar el modificador DEFAULT
	 * 
	 * 1º Nos vamos a la clase1 y cambiamos el modificador. No ponemos nada antes
	 * de la variable. El sistema entenderá que es el modificador POR DEFECTO.
	 * 
	 * 2º creamos una variable que intente usar la variable creada en la Clase1
	 * 
	 * 3º Si heredamos de una clase a otra clase en el mismo paquete, no dará
	 * error y podremos usarla sin problema.
	 * 
	 * 4º Si esa misma clase, estuviera en otro paquete, nos saldría un error.
	 * 
	 */
	
	
	//String mimensaje = mensaje;
}
