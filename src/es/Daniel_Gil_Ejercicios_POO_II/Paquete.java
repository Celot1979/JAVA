package es.Daniel_Gil_Ejercicios_POO_II;

import java.util.Scanner;

public class Paquete {
	//-----------------------------------------------------------------------------------------------
	//Constructor
	public Paquete() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Referencia  del paquete: ");
		int referencia = entrada.nextInt();
		this.referencia = referencia;
		
		//----------------------------------------------
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Que peso tiene el paquete: ");
		int peso = entrada2.nextInt();
		this.peso = peso;
		
		//----------------------------------------------
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("DNI del cliente: ");
		int DNI = entrada3.nextInt();
		this.DNI = DNI;
	
		//----------------------------------------------
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Que prioridad quiere darle al paquete:\n0 Normal\n1 Alta\n2 Urgente ");
		
		int num1 = entrada4.nextInt();
		if(num1 < 1) {
			this.prioridad = num1;
			System.out.println("Prioridad baja");
		}else if (num1 == 1) {
			this.prioridad = num1;
			System.out.println("Prioridad alta");
			
		}else {
			this.prioridad = num1;
			System.out.println("Prioridad Urgente");
		}
		
		//this.prioridad = num1;
		
		
		
	}
	//-----------------------------------------------------------------------------------------------
	// Getters del constructor
	public int getReferencia() {
		return referencia;
	}
	
	public String getPeso() {
		return "El peso del paquete es: " + (int)peso;
	}
	
	public int getDNI() {
		return DNI;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	//-----------------------------------------------------------------------------------------------
    // Setters peso, prioridad
	
	public void setPeso() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que peso tiene el paquete: ");
		int num1 = entrada.nextInt();
		this.peso = num1;
		entrada.close();
	}
	
	
	public void setPrioridad() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que prioridad quiere darle al paquete:\n0 Normal\n1 Alta\n2 Urgente ");
		
		int num1 = entrada.nextInt();
		if(num1 < 1) {
			this.prioridad = num1;
			System.out.println("Prioridad baja");
		}else if (num1 == 1) {
			this.prioridad = num1;
			System.out.println("Prioridad alta");
			
		}else {
			this.prioridad = num1;
			System.out.println("Prioridad Urgente");
		}
		
		//this.prioridad = num1;
		entrada.close();
		
		
	}
	
	
	
	
	
	// Propiedades 
	
	private int referencia;
	private int peso;
	private int DNI;
	private int prioridad;
	//-----------------------------------------------------------------------------------------------
	
}
