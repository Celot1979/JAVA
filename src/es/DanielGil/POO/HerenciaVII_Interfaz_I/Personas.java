package es.DanielGil.POO.HerenciaVII_Interfaz_I;

import java.util.Date;

public abstract class Personas {
	
	public Personas(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
	
	//Propiedades
	
	private String nombre;

}

class Empleados extends Personas {

	public Empleados(String nom, Date fechaAlta, double sueldo) {
		super(nom);
		this.fechaAlta= fechaAlta;
		this.sueldo =sueldo;
	}
	
	
	
	
	
	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El empleado " + this.getNombre() + " tiene un sueldo de: " + sueldo + " €" + " y entró a trabajar en: " + fechaAlta;
	}
	
	//Propiedades
		private double sueldo;
		private Date fechaAlta;

}

class Jefes extends Empleados implements ParaJefes{

	public Jefes(String nom, Date fechaAlta, double sueldo) {
		super(nom, fechaAlta, sueldo);
		
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;

	}
	
	//Propiedades
	private double incentivo;
	private double sueldo_total;
	@Override
	public void setCargo(String cargo) {
		this.cargo = cargo;
		
	}

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "\nAdemás tiene el cargo de: " + cargo;
	}
	private String cargo;
}

class Alumnos extends Personas{

	public Alumnos(String n, String a_optativas, String aula) {
		super(n);
		this.a_optativas = a_optativas;
		this.aula = aula;
	}
	

	
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El nombre del alumno es: " + this.getNombre() + " está en el aula " + aula + " y ha escogido la asignatura " + a_optativas;
	}
	
	//Propiedades
		private String a_optativas;
		private String aula;
	
	
}


