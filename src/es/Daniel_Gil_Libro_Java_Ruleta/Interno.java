package es.Daniel_Gil_Libro_Java_Ruleta;

import java.util.Scanner;

public class Interno {
	
	public Interno() {
		Scanner number = new Scanner(System.in);
		System.out.println("Que numero escoges?:");
		int numero = number.nextInt();
		this.numero = numero;
		// Se pide a usuario el número de la apuesta
		
		
		Scanner colur = new Scanner(System.in);
		System.out.println("Que color:");
		String color = colur.nextLine();
		this.color = color;
		// Se pide a usuario el color de la apuesta
		
		
		
		
		
		
	}
	
	
	public void setJugada_Maquina() {
		numero_ruleta = (int)(Math.random()*10+1);
		color_ruleta = (int)(Math.random()*1+2);
		//Se realiza la combinacion aleatoria del programa del número y color 
		
		if(color_ruleta == 1) {
			conversion = "Rojo";
		}else {
			conversion ="Negro";
		}
		
		//Se realiza una converción de el int del color a un Sring
		
	}
	
	
	public String getNumero_Ruleta() {
		return "El numero es : " + numero_ruleta + " " + conversion ;	
		// Se ejecuta por consola el mensaje de la combinaciaón aleatoria
		
		
	
	}
	
	
	
	
	
	public String getElegido() {
		String combinacion;
		combinacion =  numero + " " + color; 
		
		return "El jugador ha elegido " +  combinacion; 
		// Se ejecuta por consola el mensaje de la elección del jugador
	}
	
	
	public void setApuesta() {
		eleccion = 1;
		
		while (cantidad_Total > 0 && eleccion == 1) {
			
			Scanner p = new Scanner(System.in);
			System.out.println("Quieres jugar:\n1.Si\n2.No");
			int opcion = p.nextInt();
			
			
			if(opcion == 1) {
				eleccion = 1;
				Scanner p2 = new Scanner(System.in);
				System.out.println("Cuanto quieres apostar");
				int apuesta_jugador = p2.nextInt();
				
				Scanner number = new Scanner(System.in);
				System.out.println("Que numero escoges?:");
				int numero = number.nextInt();
				this.numero = numero;
				// Se pide a usuario el número de la apuesta
				
				
				Scanner colur = new Scanner(System.in);
				System.out.println("Que color:");
				String color = colur.nextLine();
				this.color = color;
				
				numero_ruleta = (int)(Math.random()*10+1);
				color_ruleta = (int)(Math.random()*1+2);
				
				System.out.println("El numero es : " + numero_ruleta + " " + conversion );
				
				
				//Se realiza la combinacion aleatoria del programa del número y color 
				
				if(color_ruleta == 1) {
					conversion = "Rojo";
				}else {
					conversion ="Negro";
				}
				
				
				
				
				
				if(numero_ruleta == numero && conversion == color) {
					if (apuesta_jugador < cantidad_Total) {
						cantidad_Total = cantidad_Total + (apuesta_jugador * 2);
						System.out.println(cantidad_Total);
						System.out.println("G A N A S");
					}else {
						eleccion=2;
					}
					
					
					
			     }else if(numero_ruleta != numero && conversion != color) {
			    	 if (apuesta_jugador < cantidad_Total) {
							cantidad_Total = cantidad_Total - apuesta_jugador ;
							System.out.println(cantidad_Total);
							System.out.println("P I E R D E S");
						}else {
							System.out.println("No tienes fondos para apostar esa cantidad");
							eleccion=2;
						}
			    	
			    	 
			     }
				
				if( cantidad_Total  < 0) {
					System.out.println("No tienes fondos. Deberias recargar.....");
					eleccion=2;
					eleccion = 2;
				}
				
				
			}else if (opcion == 2) {
				System.out.println("Gracias por su visita lo esperamos pronto");
				eleccion=2;
				eleccion = 2;
			}
			
		
			
			
		}
		
		
	}
	
	
	
	// Propiedades
	
	
	//private String Rojo = "Rojo";
	//private String Negro = "Negro";
	
	
	private int numero;
	private String color;
	//Está en el constructor
	
	private int numero_ruleta;
	private int color_ruleta;
	private String conversion;
	
	private int cantidad_Total = 1000;
	private int eleccion;

}
