package es.Daniel_Gil_Ejercicios_Internet_Array;

public class Ejercicio_Array_Cuatro {

	public static void main(String[] args) {
		//Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
		
		int i= 0;
		int [] array = new int[100];
		int suma =0;
		int media = 0;
		int total = 0;
		
		for (i = 0; i<array.length;i++) {
			
			array[i]= (int) (Math.random()* 100);
			
			System.out.println(array[i]);
		}
		
		for(i = 0; i < array.length; i++) {
			
			suma = suma + array[i];
			media ++;
			total = suma / media;
		}
		System.out.println(suma);
		System.out.println(media);
		System.out.println("La suma total de los 100 numeros aleatorios son: " + suma + " Con una media de: " + total);
		
		
	}

}
