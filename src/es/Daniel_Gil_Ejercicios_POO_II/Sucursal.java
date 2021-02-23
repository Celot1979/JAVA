package es.Daniel_Gil_Ejercicios_POO_II;

public class Sucursal {
	public Sucursal(int numero_sucursal, String direccion, String ciudad) {
		this.numero_sucursal=numero_sucursal;
		this.direccion=direccion;
		this.ciudad=ciudad;
	}
	
	public String getNumero_sucursal() {
		return "El n�mero de la sucursal es: " + numero_sucursal;
	}
	
	public String getdireccion() {
		return "La direcci�n es: " + direccion;
		
	}
	
	public String getciudad() {
		return "La ciudad es: " + ciudad;
		
	}
	
	public void setPrecio(String paquete, int prioridad) {
		paquete = paquete;
		switch(prioridad) {
		case 1:
			prioridad = 1;
		case 2:
			prioridad = 2;
		
		}
			
				
		
	}
	
	
	
	private int numero_sucursal;
	private String direccion;
	private String ciudad;

}
