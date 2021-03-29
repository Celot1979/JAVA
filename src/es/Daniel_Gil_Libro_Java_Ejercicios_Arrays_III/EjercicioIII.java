package es.Daniel_Gil_Libro_Java_Ejercicios_Arrays_III;

import java.util.Random;

public class EjercicioIII {

	public static void main(String[] args) {
		// Combinación de primitiva de un array de 6 elementos y que los numeros no se repitan. Lo numeros aleatorios deben de ser de l 1 al 49.
		
		Interno g1 = new Interno();
		//System.out.println(g1);
		//System.out.println(g1.setArreglo());
		
		
		}
}

class Interno{
	public Interno() {
		Random r = new Random();
		this.arreglo = arreglo;
		aux = 1;
		aux2 = 2;
		
		for(int i = 0; i < arreglo.length; i++) {
			arreglo[i]= r.nextInt(49);
			System.out.println("La combinación es esta : \n" + arreglo[i]);
			if(arreglo[i] == arreglo[i+1]) {
				aux2 = arreglo[i];
				arreglo[i] =  arreglo[i + 1];
				arreglo[i + 1] = aux2;
			}else {
				continue;
			}
			
			System.out.println("La combinación es esta : \n" + arreglo[i]);
		}
	
     }
	


	
	









	private int tam =6;
	private int [] arreglo = new int [tam];
	private int aux;
	private int aux2;
	
	
	
}