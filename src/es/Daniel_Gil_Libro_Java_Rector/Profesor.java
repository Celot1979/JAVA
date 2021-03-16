package es.Daniel_Gil_Libro_Java_Rector;

public class Profesor {
	
	public Profesor(String n, int s) {
		nombre = n;
		sueldo = s;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}



	//Propiedades
	private String nombre;
	private int sueldo;

}


class Rector extends Profesor{

	public Rector(String n, int s) {
		super(n, s);
		// TODO Auto-generated constructor stub
	}
	
	
	public void setIncentivo(int a) {
		incentivo = 0.25;
	}
	
	public double SetSueldo() {
		sueldo = super.getSueldo();
		return resultado = sueldo + (sueldo * incentivo);
	}



	private int sueldo;
	private double resultado;
	private double incentivo;
	
}