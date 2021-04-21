package es.DanielGil.POO.HerenciaVII_Interfaces_III_Herencias_Interfaces;

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
/*Se debe de recordar que la diferencia entre la clase empleados y la clase Jefes;
 * 
 * Es que en empleados se usa la interfaz( por eso se pone coma y se añade simplemente
 * 
 * la interfaz en cuestión); y en la clase Jefes se obliga a usarla porque se ha
 * 
 * implementado la interfaz ParaJefe que a su vez hereda los métodos de ParaTrabajadores
 * 
 * Esa es la diferencia por la que se usa una sintasis u otra.
 */
class Empleados extends Personas implements Comparable, ParaTrabajadores {

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
	
	
	public int compareTo(Object o) {
		Empleados otroEmpleado = (Empleados)o;
		if(this.sueldo < otroEmpleado.sueldo)return -1;
		if(this.sueldo > otroEmpleado.sueldo)return 1;
		return 0;
		
	}
	
	@Override
	public double setBonus(double gratificacion) {
		// Es el método que viene heredado de sumar la interfaz
		// ParaTrabajadores que será quien de un bonus/prima a todos los
		//trabajadores obligatoriamente.
		
		return ParaTrabajadores.bonus + gratificacion;
	}
	
	//Propiedades
		private double sueldo;
		private Date fechaAlta;
		
		

}

class Jefes extends Empleados implements ParaJefe{

	public Jefes(String nom, Date fechaAlta, double sueldo) {
		super(nom, fechaAlta, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;

	}
	@Override
	public void setCargo(String cargo) {
		this.cargo = cargo;
		
	}

	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "\n Además tiene el cargo de: " + cargo;
	}
	
	@Override
	public double setBonus(double gratificacion) {
		// Método perteneciente a la interfaz ParaJefes
		// que viene heredada para la interfaz ParaTrabajadores
		double prima = 2000;
		return prima + gratificacion + ParaTrabajadores.bonus;
	}
	
	//Propiedades
	private double incentivo;
	private double sueldo_total;
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


