package es.Daniel_Gil_Libro_Java_Ejercicios_Arrays_IV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Interno2 {
	public Interno2(){
		/*Scanner entrada = new Scanner(System.in);
		System.out.println(" Ingresa 10 números: ");
		int numero = entrada.nextInt();*/
		
		//ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println(" Ingresa 10 números: ");
			int numero = entrada.nextInt();
			numeros.add(numero);
			
		}
		Collections.sort(numeros);
		
		
		
		for(int k =0; k < 2;k++) {
			System.out.println(numeros);
		}
		
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Propiedades
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	private int sum;
	private int ordenar;

}
