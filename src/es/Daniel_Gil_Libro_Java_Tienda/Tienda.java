package es.Daniel_Gil_Libro_Java_Tienda;

import java.util.Scanner;

public class Tienda {

	private static int diferencia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		
		Scanner pregunta1 = new Scanner(System.in);
		
		System.out.println("¿Desea realizar una compra?: \n1.Si\n2.No");
		
		int resp1 = pregunta1.nextInt();
		
		if(resp1 == 1) {
			Scanner preguntaDia = new Scanner(System.in);
			System.out.println("Introduzca su día de nacimiento:");
			
			int resp2 = preguntaDia.nextInt();
			
			
			Scanner preguntaMes = new Scanner(System.in);
			System.out.println("Introduzca el mes de su nacimiento:");
			
			int resp3 = preguntaMes.nextInt();
			
			
			Scanner preguntaAgno = new Scanner(System.in);
			System.out.println("Introduzca el año de su nacimiento:");
			
			int resp4 = preguntaAgno.nextInt();
			
			
			Fecha usuario1 = new Fecha(resp2, resp3, resp4);
			
			usuario1.setAgnos();
			
			
			
			
			System.out.println(usuario1.getAgnos());
			
			System.out.println("--------------------------------------------- Precio del producto escogido ---------------------------------------  ");
			Scanner prod1= new Scanner(System.in);
			System.out.println("Introducce el precio del producto:");
			
			int pre = prod1.nextInt();
			
			
			usuario1.setDescuento_Mayores(pre);
			usuario1.setAplicacion_Descuentos(pre);
			
			//System.out.println(usuario1.getDescuentos());
			
			//System.out.println(usuario1.getDescuento_Mayores());
			
			System.out.println(usuario1.getDatos());
			
			
			
			
			
				
				
		
			
			
			
		}
		
		
		

	}

}
