package es.Daniel_Gil.Arrays;

public class ARRAY_Dos_ALmacenar_Recorrer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] valores=new int[5];
		
		valores[0]= 15;
		valores[2]= 1;
		valores[3]= 23;
		valores[4]= 50;
		
		
		System.out.println(valores[2]);*/
		
		//--------------------------------------------
		// 2� Forma de declarar y a�adir los elementos
		/*int [] valores = {15,1,23,50};
		System.out.println(valores[2]);*/
		
		//-------------------------------------------
		// Recorrer un array con bucles for
		/*Como sabemos un bucle for comienza con una
		 * declaraci�n del valor de la condici�n, 
		 * en est� caso es ideal porque los arrays empiezan
		 * siempre por el valor cero.
		 * A continuaci�n sabemos que hay s�lo 4 elementos m�s
		 * recordemos que los valores van desde 0 el priemr elemmento
		 * hasta el final.
		 * Y finalmente el incremento*/
		int [] valores = {15,1,23,50};
		for(int i = 0; i<5;i++) {
			System.out.println(valores[i]);
		}
		
		
		
		

	}

}
