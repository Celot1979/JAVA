package es.Daniel_Gil_Libro_Java_Busqueda_Binaria;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Binaria_Propia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arreglo[], nElementos, aux, inferior, centro,superior;
		
		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos elementos tendrá el array: "));
		arreglo = new int[nElementos];
		
		
		for ( int i = 0; i < nElementos; i++) {
			int numeros = Integer.parseInt(JOptionPane.showInputDialog("Digitaliza número a número"));
			arreglo[i]= numeros;
		}
		
		
		System.out.println("El ARRAY está formado por: ");
		
		for (int i = 0; i < nElementos; i++) {
			JOptionPane.showMessageDialog(null, "El ARRAY está formado por: " + arreglo[i]);
			System.out.print(arreglo[i] + " ");
		}
		
		
		for(int i = 0; i < (nElementos -1); i++) {
			for(int j = 0; j < (nElementos - 1); j++) {
				if(arreglo[j] > arreglo[j + 1]) {
					aux = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = aux;
				}
	
			}
		}
		
		System.out.println("\nEl ARRAY ordenado quedaría así: \n");
		for(int i = 0; i < nElementos; i++) {
			JOptionPane.showMessageDialog(null, arreglo[i]);
			System.out.print(arreglo[i] + " ");
		}
		
		int num_esc = Integer.parseInt(JOptionPane.showInputDialog("Que número quiere buscar: "));
		
		inferior = 0;
		superior = nElementos -1;
		
		while(inferior <= superior) {
			centro = (superior + inferior)/2;
			
			if(arreglo[centro] == num_esc) {
				JOptionPane.showMessageDialog(null, "El número que buscabas se encuentra en la posición :" + (int)(centro + 1));
				System.out.println("El número que buscabas se encuentra en la posición :" + (int)centro + 1);
				break;
			}else if(num_esc < arreglo[centro]) {
				superior = centro - 1;
			}else {
				inferior = centro +1;
			}
		}
		
		
         
		}

	}


