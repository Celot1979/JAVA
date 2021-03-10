package es.Daniel_Gil_Libro_Java_Juego_Memoria;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Proceso {
	public Proceso() {
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
	
	
	public void setCreación() {
		cantidad = 0;
		
        Random n = new Random();
        Random n1 = new Random();
        
        
       if (cantidad <= 1) {
    	   num =n.nextInt(3)+1;
   		   List listaA = new ArrayList();
   		   listaA.add(num);
   		
   		   System.out.println(listaA);
   		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		   for (int i = 0; i < 20; ++i) System.out.println();

   		

   		   
   		   
   		   
   		   Scanner u = new Scanner(System.in);
   		   System.out.println("Escribe la serie memorizada: ");
   		   int user = u.nextInt();
   		   
   		   List listaB = new ArrayList();
   		   listaB.add(user);
   		   System.out.println(listaB);
   		   
   		   
   		   if (listaA.equals(listaB)) {
   			   System.out.println("Correcto");
   			   cantidad += 1;
   			   if(cantidad == 1) {
   				   num = n.nextInt(3)+1;
   				   int num1 =n1.nextInt(3)+1;
   				   listaA.clear();
   				   listaA.add(num );
   				   listaA.add(num1);
   				   System.out.println(listaA);
   				   try {
   					   Thread.sleep(2000);
   					   } catch (InterruptedException e) {
   						   e.printStackTrace();
				   }
		   		   for (int i = 0; i < 20; ++i) System.out.println();
		   		   
		   		   
   				   while(cantidad == 1 && cantidad <3) {
   					listaB.clear();
   					Scanner u1 = new Scanner(System.in);
   		   		    System.out.println("Escribe la serie memorizada: ");
   		   		    int user1 = u1.nextInt();
   		   		    listaB.add(user1);
   		   		    cantidad += 1;
   		   		    

   		   		    
   		   		    Scanner u2 = new Scanner(System.in);
		   		    System.out.println("Escribe la serie memorizada: ");
		   		    int user2 = u2.nextInt();
		   		    listaB.add(user2);
		   		    System.out.println(listaB);
		   		    cantidad += 1;
		   		    if (listaA.equals(listaB)) {
		   		    	System.out.println("Correcto pasas a la siguiente ronda");
		   		    	
		   		    }else {
		   		    	System.out.println("Juego finalizado.");
		   		    }
		   		    
   		   		    
   					
   				   }
   				   
   				   
   			   }
   		   }else {
   			   System.out.println("Juego finalizado.");
   			   
   		   }
   		
  
   		   
       }
        }
        
		
	
	
	
	
	

	
    
	
	
		
	
	
	
    
	
	private int nivel;
	private String nivel_Letras;
	private int Numeros;
    private int Numeros2;
	private int numeros_Usuario;
	private int Numeros_Usuario ;
	private int num;
	private int usuario;
	private int continuar;
	private int i;
	private int cantidad;
	private int rango;
	private int numeros_Ordenador;
	
	
	

}
