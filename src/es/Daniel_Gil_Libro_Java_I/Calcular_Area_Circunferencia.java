package es.Daniel_Gil_Libro_Java_I;
import java.lang.Math;
import java.util.Scanner;

public class Calcular_Area_Circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Area = Pi * R**2
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdduce el radio: ");
		double r= entrada.nextInt();
		
		double area = (double)Math.PI * Math.pow(r, 2);
		
		System.out.println(area);
		
		//Calculo de la circunferencia: 
		
		
		double diametro = Math.pow(r, 2);
		
		double circunferencia = 2 * (double)Math.PI * r;
		
		System.out.println(circunferencia);
		
	}

}
