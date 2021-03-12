package es.DanielGil.POO.HerenciaIV.PoliformismoI;

import java.util.GregorianCalendar;

//En este código veremos la explicación del polimorfismo. 





public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*2º.Después de crear el array, y del ciclo for each, el profesor va a realizar algo muy curioso.
		 * Se trata de crear un objeto de tipo JEFE y introduccirlo dentro del Array tipo Empleado.
		 * ¿Curioso verdad?. Vamos a ver como lo hace
		 */
		Jefes Juan = new Jefes("Juan", 8000, 2013, 8,5);
		Juan.setIncentivo(200);
		
		
		/*1ºPara explicar está lección el profesor ha decidido que creemos 4 empleados, pero mediante un ARRAY. A contiuación se explica la creación y funcionamiento del mismo.*/
		
		Empleados [] losEmpleados = new Empleados[5];
		
		losEmpleados[0]= new Empleados("Antonio", 2300.5, 2005, 7, 15);
		losEmpleados[1]= new Empleados("Carlos", 5000.5, 2001, 2, 15);
		losEmpleados[2]= new Empleados("Vero", 1500.5, 2018, 2, 15);
		losEmpleados[3]= new Empleados("Adrian", 1800, 2003, 12, 5);
		losEmpleados[4]= Juan;//Aquí es donde se ve el PRINCIPIO DE SUSTITUCIÓN
		//Para recorrer y saber la información de os empleados que están en el ARRAY, debemos
		//USar un for each.
		
		for(Empleados obj : losEmpleados) {
			System.out.println(obj.getDatosEmpleados() + " y un salario de: " + obj.getSueldo());
			//Sirve para ver la posción que toma (ID) y a posteriorí hemos concatenado el salario
			
		}
		
		
	
		
		

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
