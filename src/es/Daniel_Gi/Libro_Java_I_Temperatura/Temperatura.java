package es.Daniel_Gi.Libro_Java_I_Temperatura;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Celsius C1 = new Celsius (23);
		
		Fahrenheit F1 = new Fahrenheit( 74.4);
		
		System.out.println(F1.getFahrenheit());
		
		System.out.println(C1.getCelsius());
		
		
		System.out.println(C1.getConvertirFaren());
		
		System.out.println(F1.getConvertirCelsius());*/
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("¿Qué sesas convertir de  celsius a Fahrenheit? (pulsa 1) -  ¿ Si deseas convertir de fahrenheit a celsius? (pulsa 2)");
		
		int r1= entrada.nextInt();
		
		if (r1 == 1) {
			
			Scanner num1 = new Scanner (System.in);
			System.out.println("¿Qué grados en celsius quieres convertir: ?");
			int c = num1.nextInt();
			
			Celsius C1 = new Celsius(c);
			
			System.out.println(C1.getConvertirFaren());
			num1.close();
			
			
		} else if ( r1 == 2) {
			Scanner num2 = new Scanner (System.in);
			System.out.println("¿Qué grados en Fahrenheit quieres convertir: ?");
			int f = num2.nextInt();
			
			Fahrenheit F1 = new Fahrenheit(f);
			
			System.out.println(F1.getConvertirCelsius());
			num2.close();
			
			
			
			
		}else {
			entrada.close();
			System.out.println("ERROR");
		}

		
		

	}

}
