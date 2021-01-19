package es.Daniel_Gil_Ejercicios_Internet;

import javax.swing.JOptionPane;

public class Ejercicio_Cuatro {

	public static void main(String[] args) {
		/*Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. 
		 * Por ejemplo: si introduzco un 97, me muestre una a.
		 */
		/*int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero, por favor"));
		
		char caracter = (char) numero;
		System.out.println(caracter);*/
		
		String texto=JOptionPane.showInputDialog("Introduce un caracter ASCII");
        //Pasamos el String a char con el metodo charAt
        char caracter=texto.charAt(0);
  
        //Pasamos el caracter a codigo
        int codigo=(int)caracter;
  
        JOptionPane.showConfirmDialog(null, codigo);
		
		

	}

}
