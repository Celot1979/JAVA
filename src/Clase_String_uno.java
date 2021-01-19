
public class Clase_String_uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Dani";
		System.out.println("Mi nombre es " + nombre);
		System.out.println("La longitud de mi nombre es  " + nombre.length() + " letras");
		int ultima_letra = nombre.length();
		System.out.println("La primera letra es   " + nombre.charAt(0) + " y la ultima " + nombre.charAt(3));
		System.out.println("La última letra de la cadena es   " + nombre + " es la letra " + nombre.charAt(ultima_letra - 1));

	}

}
