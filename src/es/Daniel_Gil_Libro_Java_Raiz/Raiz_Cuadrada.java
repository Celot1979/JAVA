package es.Daniel_Gil_Libro_Java_Raiz;

import java.util.Scanner;

public class Raiz_Cuadrada {

	public static void main(String[] args) {
		/* @Author: Daniel
		 * @param: private int num;
		 * @param public Raiz
		 * @version: 1.0
		 */
		Raiz pete = new Raiz();
		System.out.println(pete);
		

	}

}

class Raiz{
	
	
	public Raiz() {
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el número al que deseas calcular la raiz cuadrada, por favor: ");
			int num = entrada.nextInt();
			if (num > 0) {
				double r = (int)Math.sqrt(num);
				
				System.out.println("La raiz cuadrada del número " + num + " es:" + r);
				
			}else if ( num < 0) {
				System.out.println("Nose admiten números negativos");
			}
			
			
			
		}catch(ArithmeticException e) {
			System.out.println("Error");
			r = -1;
		}
	}
	
	
	
	
	
	
	
	
	private void cach() {
		// TODO Auto-generated method stub
		
	}








	//Propiedades
	private int num;
	private double r;
	
	
	
}
