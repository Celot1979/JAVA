package es.Daniel_Gil_Libro_Java_Restar_Mayor_Menor;

import java.util.Scanner;

public class Resta {

	public static void main(String[] args) {
		/* @Author: Daniel
		 * @param: private int A;
		 * @param: private int B;
		 * @param public Resta
		 * @param: Importante (private int resultado;)
		 * @version: 1.0
		 */
		
		
		Rest Operation = new Rest();
        System.out.println(Operation.getDatosOperacion());
		
		
	}

}

class Rest {
	private int resultado;// Si no no deja realizar la operación de retornar un resultado
	public Rest() {
		Scanner entrada1 = new Scanner(System.in);
		
		System.out.println("Introduzca 1º número");
		
		int A = entrada1.nextInt();
		
		Scanner entrada2= new Scanner(System.in);
        
		System.out.println("Introduzca 2º número");
		
		int B = entrada2.nextInt();
		resultado = 0;
		
		if (A > B) {
			resultado = A - B;
			
		}else if (B > A) {
			resultado = B - A;
		}
		
		
	}
	
	
	
	
	public String getDatosOperacion() {
		
		return " La operación es de :" + (int)resultado;
	}
	
	// propiedades
	
	private int A;
	private int B;
	
	
}