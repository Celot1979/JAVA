package es.Daniel_Gil_Libro_Java_Juego_Memoria;

import java.util.Random;
import java.util.Scanner;

public class Interno {
	public Interno(){
		Scanner n = new Scanner (System.in);
		System.out.println("En qué nivel deseas jugar:\n1.Fácil\n2.Medio\n3.Dificil\n==> : ");
	    nivel = n.nextInt();
		
		
	}
	
	public void setNivel() {
		if(nivel ==1) {
			nivel_Letras= "Fácil";
			
		}else if (nivel == 2) {
			nivel_Letras= "Medio";
			
		}else if (nivel == 3) {
			nivel_Letras= "Dificil";
			
		}
	}
	
	
	
	
	public String getNivel() {
		return "El nivel elegido es: " + nivel_Letras;
	}
	
	
	public void limpiar() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
	}
	
	public void setSerie_Ordenador() {
		//Método para darle tiempo a que salga la siguiente sentencia (timer.sleep en python)
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			

				
		Random random = new Random();//Forma diferente de generar un número aleatorio
	      
		 for(int i = 0; i < 1; i++){
		      int randomInteger = random.nextInt(3)+1;
		      //System.out.println("Random Integer en Java: " + randomInteger);
		      
		      Numeros = randomInteger;
		    
		 }
	}
	}
	
	public String getNumeros_Ordenador() {
		return "Estos son los números: " + " ==> " +  Numeros;
		}
	
	
	public void setNumeros_Usuario(){
		
		Scanner User = new Scanner(System.in);
		System.out.println("Introduce la serie que acabas de memorizar\n==>");
		int User_number = User.nextInt();
		
		Numeros_Usuario = User_number;
		
		
		
		
	}
	
	public String getNumeros_Usuario() {
		
		return "Los números quq el usuario cree que forman parte de la serie son: " + Numeros_Usuario;
	}
	
	
	
	
	
	
	
   
	
	
	
	
	
	private int nivel;
	private String nivel_Letras;
	private int Numeros;
	private int Numeros_Usuario;
	

	
	

}
