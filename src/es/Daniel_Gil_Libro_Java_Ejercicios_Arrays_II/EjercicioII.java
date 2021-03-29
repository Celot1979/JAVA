package es.Daniel_Gil_Libro_Java_Ejercicios_Arrays_II;

public class EjercicioII {

	public static void main(String[] args) {
		// Debemos de crear dos arrays de 100 numeros cada uno, y en cada uno tener los pares e impares.
		
		int pares[] = new int[100];
		int impares[] = new int[100];
		int e = 1;
		int posicion = -1;
		
		for (int i =0; i < pares.length;i++) {
			//System.out.println(pares[i] = e);
			e++;
			
			if(e % 2 == 0) {
				pares [i] =e;
				posicion ++;
				int colocacion =pares [i] =e;
				System.out.println("#################################################################################################################");
				System.out.println("El número par de este arreglo es: " + colocacion + " y tiene la posición: " + posicion);
			}else {
				impares [i]= e;
				posicion ++;
				int colocacion2 = impares [i] =e;
				System.out.println("#################################################################################################################");
				System.out.println("El número impar de este arreglo es: " + colocacion2 + " y tiene la posición: " + posicion);
				//System.out.println(impares [i]= e);
			}
		}
		
		

	}

}
