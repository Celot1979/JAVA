package es.Daniel_Gil_Libro_Java_Tienda;

public class Producto {
	
	public Producto(int pr) {
		
		precio = pr;
		
	}
	
	
	public int Info() {
		operacion = (precio * 15)/100;
		TotalPrecio = precio - operacion;
		return TotalPrecio;
		
	}
	

	
	private int precio;
	
	private int TotalPrecio;
	
	private int operacion;

}
