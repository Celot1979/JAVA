package es.Daniel_Gil_Libro_Java_Busqueda_Binaria;

import javax.swing.JOptionPane;

public class Binaria {

	public static void main(String[] args) {
		// Búsqueda Binaria
		// 1º Hay que ordenar el arreglo
		// Creamos el array. Para ello vamos a pedir al usuario que indique la cantidad de elementos que desea
		// que tenga el arreglo. Lo vamos hacer por JoptionPane
		int aux;
		int tam = Integer.parseInt(JOptionPane.showInputDialog("¿De cuántos elementos queires que tenga el array?"));
		int arreglo[];
		arreglo = new int[tam];
		
		// 2º Tenemos que introduccir los números que formaran parte del arreglo
		
		for(int i =0; i < tam; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("¿Digitalice número a número?"));
			arreglo[i]=num;
		}
		// Ordenamos el array
		for(int i = 0; i < (tam -1); i++) {
			for(int j = 0; j < (tam - 1); j++) {
				if(arreglo[j] > arreglo[j + 1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
				}
				
				
			}
		}
		//4º Imprimimos el array
		System.out.println("El arreglo es:");
		for(int i = 0; i < tam;i++) {
			System.out.println(arreglo[i]);
		}
		
		//5ºComenzamos con la búsqueda binaria
		//5.1 Creamos un variable que sea el número que buscamos
		//5.2 Creamos tres variables que almacenarán las posición inicial, centro y final.
		//Siendo la central la que nos dirán donde está la mitad del array.
		int num_buscado = 8;
		int inferior = 0;
		int centro ;
		int superior = tam - 1;
		
		while(inferior <= superior) {//Siempre que inferior sea menor a superior-entraría en el bucle-
			centro = (superior + inferior)/2;//Para saber donde está la mitad del ARRAY
			if(arreglo[centro] == num_buscado) {
				// Si el número buscado coincide que está en la posición justo del centro
				//Suerte y se imprime la posición
				System.out.println("El número buscado está en la posición:" + (centro +1));
				break;
			}else if(num_buscado < arreglo[centro]) {
				// Si no hemos tenido suerte, entonces dividimos el arreglo. 
				//Al estar ordenado el copilador sabe que es más pequeño que el medio.
				//Así que mueve el apuntador del final a donde está el medio
				//El medio pasa a la mitad del subArray
				//Ingerior al principio del SubArray.
				//Hasta el final
				superior = centro-1;
			}else {
				// Si resulta que el numero que se busca es mayor que el centro.
				// Se realiza el camino inverso al paso anterior.
				// Inferior- que es un marcador- pasa a donde estaba el centro del array.
				// El centro al nuevo centro del subArray.
				// El superior al final del Array.
				inferior = centro +1;
			}
			}
		
			
		}
		
		
		
		
		
		

	}

