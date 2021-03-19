package es.Daniel_Gil_Libro_Java_Metodo_Quicksort;

import java.util.Arrays;

public class Quicksort {
	
	public static void quicksort(int[] array, int beginning, int finish) {
		//Base steps
		if (array == null || array.length == 0)
			return;
		if (beginning >= finish)
			return;
		
		//Recursive steps
		//First we find the pivot in the middle
		int medio = beginning  + ( finish -  beginning)/2;
		int pivote = array[medio];
		
		int izq = beginning;
		int der= finish;
		/*As long as the beginning is smaller than the end, 
		 * we look on the left side for a greater value of the pivot 
		 */
		while(izq <= der) {
			while (array[izq] < pivote) {
				izq ++;
			 }
			/*
			 * we look for a value from the right smaller than the pivot
			 * */
			while(array[der] > pivote ) {
				der --;
			 }
			    
			 /*The pointer on the left is less than or equal to the one on the right we exchange elements we exchange elements 
			  * 
			  */
			 if(izq  <= der) {
				 int aux = array[izq];
			     array[izq] = array[der];
			     array[der] = aux;
			     der--;
			     izq++;
			     
			 }// fin del condicional
		}// fin del while exterior
		
		//Recursion
		
		if (beginning  < der) {
			{quicksort(array, beginning,der);}
			
			if (finish > izq) {
				quicksort(array, finish,izq);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = {9,2,4,5,6,7,8,2,44,55,90,1456,300,345654,1,76};
		
		System.out.println(Arrays.toString(x));
		
		int since = 0;
		int until = x.length - 1;
		quicksort(x,since,until);
		System.out.println(Arrays.toString(x));
		
		}

	}


