package es.Daniel_Gil_Libro_Java_Dados;

import java.util.Random;

public class Prueba {

	public static int [] llenarArrayAleatorio(int desde, int hasta, int tam){
        int[] numeros = new int[tam];                                                                             
        Random rnd = new Random();
        for (int i = 0; i < numeros.length; i++) {
             numeros[i] = rnd.nextInt(hasta - desde + 1) + desde;                                                 
        }
        return numeros;
}

}
