package es.Daniel_Gil_Libro_Java_Ejercicios_Arrays_IV;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Interno G1 = new Interno();
		G1.setMedia();
		System.out.println(G1.getMedia());
		System.out.println("#################################################################################");
		
		System.out.println(G1.setOrdenar());
		
		System.out.println("#################################################################################");
		System.out.println(G1.setMediaSuperior());
		
		System.out.println("#################################################################################");
		System.out.println(G1.setMediaInferior());*/
        //##########################################################################################################
		
		
		
		Interno2 Bu = new Interno2();
		System.out.println(Bu);
		
	}

}

class Interno{
	public Interno() {
		Scanner entrada = new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(" Ingresa 10 números: ");
			int numero = entrada.nextInt();
			arreglo [i]= numero;

		}
		
		for(int j = 0; j < 10; j++) {
			System.out.print(arreglo [j] + " ");
		}
	}
	
	
	public void setMedia() {
		for(int i = 0; i < 10; i++) {
			suma += arreglo[i];
			
			media = suma/2;
		}
		
	}
	
	
	public String getMedia() {
		return "\nLa media es: " + media;
	}
	
	
	public boolean setOrdenar() {
		Arrays.sort(arreglo);
		for(int j = 0; j < 10; j++) {
			System.out.print(arreglo [j] + " ");
		}
		return false;
		
	}
	
	
	public boolean  setMediaSuperior() {
		System.out.print("El arreglo de la mitad para arriba sería: ");
		for(int i =0; i < 5; i++) {
			
			System.out.print(arreglo[i+5] + " ");
		}
		return false;
		
	}
	
	
	public boolean  setMediaInferior() {
		System.out.print("El arreglo de la mitad para abajo es: ");
		for(int i =0; i < 5; i++) {
			
			System.out.print(arreglo[i] + " ");
		}
		return false;
		
	}
	
	
	
	
	private int [] arreglo = new int [10];
	private int suma;
	private int media;
	private int control;
}
