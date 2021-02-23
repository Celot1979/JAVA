package es.Daniel_Gil_Libro_Java_Tienda;

import java.util.Date;

public class Fecha {
	public Fecha(int da, int mo, int ag) {
		this.year = 2021;
		agno = ag;
		moth = mo;
		day = da;
		
		this.precio = precio; 
		
		
	}
	
	
	public void setAgnos() {
		
		
		diferencia = year - agno;
		
		
	}
	
	
	public String getAgnos() {
		
		return "La edad es: " + diferencia;
	}
	
	
	public void setDescuento_Mayores(int pre) {
		precio = pre;
		operacion = (precio*15)/100;
		TotalPrecio = precio - operacion;
		
		
	}
	
	public String getDescuento_Mayores() {
		return "El precio con descuento es: " + TotalPrecio;
	}
	
	
	public void setAplicacion_Descuentos(int pre) {
		precio = pre;
		
		
		if (diferencia >= 65) {
			operacion = (precio * 15)/100;
			TotalPrecio = precio - operacion;
			
		}else if (diferencia <= 25) {
			operacion = (precio * 10)/100;
			TotalPrecio = precio - operacion;
			
		}else if (diferencia > 25 && diferencia < 65) {
			TotalPrecio = precio;
		}
	}
	
	
	public int getDescuentos() {
		return TotalPrecio;
	}
	
	public String getDatos() {
		return "El usuario tiene " + diferencia + " " + " el precio del producto con descuento es: " + TotalPrecio;
	}
	
	
	
	
    final private int year;
    private int agno;
    private int moth;
    private int day;
    
    private double diferencia;
    

	private int precio;
	
	private int TotalPrecio;
	
	private int operacion;
	
	private boolean conf;
}


