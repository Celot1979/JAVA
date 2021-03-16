package es.Daniel_Gil_Libro_Java_Animal_Clone_Equeals;



public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interno A1= new Interno("PEPE", 21);
		System.out.println(	A1.getNombre()+ " - " +  A1.getEdad() + " - " + A1.getContador());
		
		Interno A2 = new Interno("ANA",11);
		System.out.println(	A2.getNombre()+ " - " +  A2.getEdad() + " - " + A2.getContador());
		
		Interno A3 = new Interno(A1);
		System.out.println(	A3.getNombre()+ " - " +  A3.getEdad() + " - " + A3.getContador());
		
		/*Interno EJEMPLO_CLONADO = A1.clone();
		EJEMPLO_CLONADO.setCambiarNombre("Evaristo");
		EJEMPLO_CLONADO.setCambiarEdad(12);
		System.out.println(EJEMPLO_CLONADO.getNombre() + " - " + EJEMPLO_CLONADO.getEdad() + " - " + EJEMPLO_CLONADO.getContador());
		
		
		System.out.println(A1.equals(EJEMPLO_CLONADO));*/
		
		
	     
		
		
	    /* 4º Una vez realizados los pasos de la clase Interno, instanciamos el 1º objeto. Podemos usar los diferentes métodos si queremos. En el caso de esté ejercicio, con el fin de no alargarlo 
	     * demasiado, simplemente se imprime los datos introduccidos por constructor.
	     * 
	     * 5º Una vez realizado el último paso, creamos un nuevo objeto. Está vez será clonado del 1º. AL crearlo se instancia en base al 1º objeto.
	     * 
	     * Por último se puede cambiar el nombre y edad porque habíamos crado esos métodos en la clase Interno. Pero si no hacemos estos pasos, simplemente se imprimiría el mismo nombre del animal
	     * y la misma edad que el objeto gemelo.
	     * 
	     */
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        
		
		Perro P1 = new Perro("Amanda", 3, "Persa");
		
		System.out.println(P1.getNombre() + " " + P1.getEdad() + " "+ P1.getRaza() + P1.getContador());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
		Interno P2 = P1.clone();
		P2.setCambiarNombre("Arturito");
		P2.setCambiarEdad(5);
		System.out.println(P2.getNombre() + " " + P2.getEdad() + " " + P2.getContador());
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
		
		Gato G1 = new Gato("Perla", 2);
		G1.setVidas(1);
		
		System.out.println(G1.getNombre() + " " + G1.getEdad() + " " + G1.getVidas() + " " + G1.getContador());
	}

}
