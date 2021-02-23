package es.DanielGil.POO.HerenciaIII;

public class CadenaHerencia {

	public static void main(String[] args) {
		/* En este ejemplo veremos:
		 * Cadena de Herencia.
		 * Clase object.
		 * Jerarquia de herencia.
		 */
		Clase4 miobj = new Clase4();
		
	
	}

}

class Clase1{
	public void metodo1() {
		
	}
	
}

class Clase2 extends Clase1{
	public void metodo2() {
		
	}
	
}

/*
 * Para hacer que una jerarquia se rompa en un punto concreto, y que ele resto de clases
 * no hereden de ella, se debe usar la palabra reservada - Final_- antes de la que deseamos
 * proeger de heredar. EJ:
 * final class Calse3 extends Clase2{
 *       public void metodo3(){
 *       }}
 */

class Clase3 extends Clase2{
     public void metodo3() {
		
	}
	
}

class Clase4 extends Clase3{
      public void metodo4() {
		
	}
	
	
}