package es.DanielGil.POO.HerenciaII;

import java.util.GregorianCalendar;




public class UsoEmpleados {

	public static void main(String[] args) {
		
		
		Empleados Antonio = new Empleados("Antonio", 2300.5, 2005, 7, 15);
		
		Jefes Ana = new Jefes("Ana", 2900.5, 2008, 8, 9);
		
		System.out.println(Antonio.getSueldo()); 
		Ana.setIncentivo(100);
	    
		System.out.println(Ana.getSueldo());
		
	
		
		

	}

}

//###########################################################################################################################
//###########################################################################################################################
//###########################################################################################################################

class Empleados{
	//Constructor
	
	public Empleados(String nom, double sue, int agno, int mes, int dia) {
		nombre= nom;
		sueldo= sue;
		calendario= new GregorianCalendar(agno, mes, dia);
		Id =IdSiguiente;
		IdSiguiente++;
		
		
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	
	public GregorianCalendar getFechaAlta() {
		return calendario;
	}
	public String getDatosEmpleados() {
		return "El empleado " + nombre +  " tiene el ID:  " + Id ;
	}
	
	
	
	public void setSubeSueldo(double porcentaje) {
		double aumento =sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	
	
	public static String getIdSiguiente() {
		return "El Id del sigueinte empelado será: " + IdSiguiente;
	}
	
	
	// Propiedades
	
	private final String nombre;
	private double sueldo;
	GregorianCalendar calendario;
	
	private int Id;
	
	private static int IdSiguiente = 1;
}

//###########################################################################################################################
//###########################################################################################################################
//###########################################################################################################################

class Jefes extends Empleados{

	public Jefes(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		
	}
	public void setIncentivo(double b) {
		incentivo = b;
	}
	
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}
	
	
	
	private double incentivo;
	
	
	
	
	
	
}
