package es.Daniel_Gil_Ejercicios_Internet_POO_II;

import java.util.Scanner;

public class Sucursal {
	public Sucursal() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Que numero de sucursal es: ");
        int numero_Sucursal = entrada.nextInt();
        this.numero_Sucursal = numero_Sucursal;
        
        
        Scanner dir = new Scanner(System.in);
        System.out.println("Direccion: ");
        String direccion = dir.nextLine();
        this.direccion = direccion;
        
        
        Scanner ciu = new Scanner(System.in);
        System.out.println("Ciudad: ");
        String ciudad = ciu.nextLine();
        this.ciudad= ciudad;
        
        
       
        
	}
	
	
	public void setPrecio(Paquete p1) {
		//System.out.println("El precio total del envio es: ");
		this.precio = precio;
		//System.out.println(p1.getPrioridad());
		if (p1.getPeso() < 20 && p1.getPrioridad() == 0) {this.precio = 5;}
		else if (p1.getPeso()< 20 && p1.getPrioridad() == 1) {this.precio = 15;}
		else if (p1.getPeso()< 20 && p1.getPrioridad() == 2) {this.precio = 25;}
		else if (p1.getPeso()> 20 && p1.getPeso()< 50 && p1.getPrioridad() == 0) {this.precio = 20;}
		else if (p1.getPeso()> 20 && p1.getPeso()< 50 && p1.getPrioridad() == 1) {this.precio = 30;}
		else if (p1.getPeso()> 20 && p1.getPeso()< 50 && p1.getPrioridad() == 2) {this.precio = 40;}
		else if (p1.getPeso()> 50  && p1.getPrioridad() == 0) {this.precio = 40;}
		else if (p1.getPeso()> 50  && p1.getPrioridad() == 1) {this.precio = 50;}
		else if (p1.getPeso()> 50  && p1.getPrioridad() == 2) {this.precio = 60;}
		
		
		//System.out.println(precio);
	}
	
	public int getnumero_Sucursal() {
		return numero_Sucursal;
	}
	
	public String getdireccion() {
		return direccion;
	}
	
	public String getciudad() {
		return ciudad;
	}
	public int getprecio() {
		return precio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private int numero_Sucursal;
	private String direccion;
	private String ciudad;
	private int precio;
	

}
