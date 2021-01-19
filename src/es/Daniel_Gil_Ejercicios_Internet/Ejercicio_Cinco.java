package es.Daniel_Gil_Ejercicios_Internet;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio_Cinco {

	public static void main(String[] args) {
		/* Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. 
		 * El IVA sera una constante que sera del 21%.
		 */
		
		
		/*final double IVA = 0.21;
		
		String precio = JOptionPane.showInputDialog("Cual es el precio ");
		double precio_final = Double.parseDouble(precio);
		
		double total_impuesto = IVA * precio_final;
		
		double total = precio_final + total_impuesto;
		
		System.out.println(" El precio del producto es " + precio_final + " con el IVA queda en: " + total);*/
		

		final double IVA = 0.21;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Que precio tiene el producto ");
		String precio = entrada.nextLine();
		
		double precio_final= Double.parseDouble(precio);
		
		double total_impuesto = IVA * precio_final;
		
		double total = precio_final + total_impuesto;
		System.out.println(" El precio del producto es " + precio_final + " con el IVA queda en: " + total);
		
		
		
		
		
		
		
		

	}

}
