package es.Daniel_Gil_Ejercicios_Internet_POO_II;

import java.util.Scanner;

public class Sucursal_y_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sucursal s1 = new Sucursal();
		boolean posibilidad = true;
		int cont;
		while (posibilidad) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Cuantos paquetes quieres enviar:\n1.Un paquete\n2.Mas paquetes\n3.Salir");
	        int paquetes = entrada.nextInt();
	        if (paquetes == 1) {
	        	Paquete p1 = new Paquete();
	        	s1.setPrecio(p1);
	        	/*System.out.println("El numero de la sucursal es: " + (int) s1.getnumero_Sucursal() +
	        			" con la direccion de " + s1.getdireccion() + " en la ciudad de " + s1.getciudad() +
	        			" con el numero de referencia "+ p1.getReferencia() + " con un peso de  " + p1.getPeso() + " kg" + 
	        			" su prioridad es de:  " + p1.getPrioridad() + " con un precio total de:  " + s1.getprecio());*/
	        	
	        	System.out.println("El numero de la sucursal es: " + (int) s1.getnumero_Sucursal());
	        	System.out.println("La direccion: " + s1.getdireccion());
	        	System.out.println("Ciudad:  " + s1.getciudad());
	        	System.out.println("Numero de referencia "+ p1.getReferencia());
	        	System.out.println("con un peso de: " + p1.getPeso() + " kg");
	        	System.out.println("Prioridad:  " + p1.getPrioridad());
	        	System.out.println("Precio total: " + s1.getprecio() + " €");
	        	
	        	
	        	System.out.println("Muchas gracias por su visita");
	        	posibilidad = false;
	        }else if (paquetes == 2) {
	        	Scanner c = new Scanner (System.in);
	        	System.out.println("Cuantos paquetes quieres enviar:\n1.\n2\n3\nTienes hasta 10 envios");
	        	int cantidad = c.nextInt();
	        	int con = cantidad;
	        	for (int i = 0; i < con; i++) {
	        		Paquete p1 = new Paquete();
		        	s1.setPrecio(p1);
		        	System.out.println("El numero de la sucursal es: " + (int) s1.getnumero_Sucursal());
		        	System.out.println("La direccion: " + s1.getdireccion());
		        	System.out.println("Ciudad:  " + s1.getciudad());
		        	System.out.println("Numero de referencia "+ p1.getReferencia());
		        	System.out.println("con un peso de: " + p1.getPeso() + " kg");
		        	System.out.println("Prioridad:  " + p1.getPrioridad());
		        	System.out.println("Precio total: " + s1.getprecio() + " €");
		        	System.out.println("Muchas gracias por su visita");
		        	posibilidad = false;
		        	
		        
	        	}
	        	
	        	
	        	
	        
	        }else if (paquetes == 3) {
	        	System.out.println("Muchas gracias por su visita");
	        	posibilidad=false;
	        }
			
		}

	}

}
