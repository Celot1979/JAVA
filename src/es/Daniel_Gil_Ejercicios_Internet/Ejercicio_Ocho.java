package es.Daniel_Gil_Ejercicios_Internet;



public class Ejercicio_Ocho {

	public static void main(String[] args) {
		// Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
		
		int numeros = 100;
		
		while (numeros != 0) {
			if (numeros % 2 == 0) {
				
				System.out.println(numeros);
			}else if (numeros % 3 == 0) {
				System.out.println(numeros);
				
			}
			numeros --;
		}

	}

}
