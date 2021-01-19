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
		// 2ª Forma de declarar y añadir los elementos
		/*int [] valores = {15,1,23,50};
		System.out.println(valores[2]);*/
		
		//-------------------------------------------
		// Recorrer un array con bucles for
		/*Como sabemos un bucle for comienza con una
		 * declaración del valor de la condición, 
		 * en esté caso es ideal porque los arrays empiezan
		 * siempre por el valor cero.
		 * A continuación sabemos que hay sólo 4 elementos más
		 * recordemos que los valores van desde 0 el priemr elemmento
		 * hasta el final.
		 * Y finalmente el incremento*/
		int [] valores = {15,1,23,50};
		for(int i = 0; i<5;i++) {
			System.out.println(valores[i]);
		}
		
		
		
		

	}

}
