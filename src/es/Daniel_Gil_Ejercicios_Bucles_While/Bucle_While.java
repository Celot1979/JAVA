package es.Daniel_Gil_Ejercicios_Bucles_While;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bucle_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		Debes crear un programa que genere un número aleatorio entre 1 y 100 y lo guarde en una variable. 
////		Al ejecutar el programa este pedirá por consola la introducción de un número entre 1 y 100.
////
////		Si el nº introducido por el usuario es mayor que el generado por el programa aleatoriamente, 
////		saldrá un mensaje en consola indicando que «el nº es menor».
////
////		Si el nº introducido por el usuario es menor que el generado por el programa aleatoriamente,
////        saldrá un mensaje en consola indicando que «el nº es mayor».
////
////		La operativa se repetirá indefinidamente hasta que el usuario adivine el nº aleatorio generado por el programa. 
////		Cuando se adivine el nº aleatorio, debe salir un mensaje en consola que diga «Correcto» y el nº de intentos consumidos 
//		    para averiguar el nº
	       
		    int aleatorio = (int) (Math.random() * 100);
		    //System.out.println(aleatorio);
		    Scanner entrada = new Scanner(System.in);
		    
		    
		    int peticion = 0;
		    
		    int intentos = 0;
		    
		    
		    while(aleatorio != peticion) {
		    	intentos ++ ;
		    	System.out.println("Introducce el numero , por favor");
		    	peticion = entrada.nextInt();
		    	if (aleatorio > peticion) {
		    		intentos++;
		    		System.out.println("El número es menor");
		    	}else if(aleatorio < peticion) {
		    		intentos++;
		    		System.out.println("El número es mayor");
		    	}
		    }
		    System.out.println("Es correcto. El numero de intentos fue" + intentos);
		   
		 

	}

}
