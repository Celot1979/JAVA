package es.Daniel_Gil_Libro_Java_Metodo_Fill;
import java.util.Arrays;
public class Fill {

	public static void main(String[] args) {
		// Metodo que sirve para rellenar arrays con elementos que nosotros deseemos
		String [] nombres= {"Ana","Pepe","Maria","Sandra"};
		
		for(String n:nombres) {
			System.out.println("La evaluacion es: " + n);
		}
		System.out.println("################################################");
		
		Arrays.fill(nombres, "Dani");
		
		
		for(String b:nombres) {
			System.out.println("La evaluacion es: " + b);
			
		}
		System.out.println("################################################");
		//############################################################################################################################################################
		
		
		int numeros[] = {1,2,3,4};
		
		for(int s : numeros) {
			System.out.println("La evaluacion es: " + s);
		}
		System.out.println("################################################");
		Arrays.fill(numeros, 12);
		for(int nu: numeros) {
			System.out.println("La evaluacion es: " + nu);
		}
		System.out.println("################################################");

}
}
		

		

	
		
		
		


