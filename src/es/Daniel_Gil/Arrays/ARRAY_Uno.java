package es.Daniel_Gil.Arrays;

public class ARRAY_Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaración de un array
		
		int[] mi_matriz = new int[5];
		
		mi_matriz[0]=15;
		mi_matriz[1]=30;
		mi_matriz[2]=1;
		mi_matriz[3]=22;
		mi_matriz[4]=500;
		
		for(int i = 0; i<5; i++) {
			
			//System.out.println("los numeros son: " + mi_matriz[i]);
			/* Si en vez de escribir println, ponemos sólo print
			 * se imprimirá por consola una sola línea. sería bueno contatenar 
			 * un "  ", para espaciar resultados.Ver ejemplo abajo.
			 */
			
			System.out.print(mi_matriz[i] + " ");
		}
		
		
		

	}

}
