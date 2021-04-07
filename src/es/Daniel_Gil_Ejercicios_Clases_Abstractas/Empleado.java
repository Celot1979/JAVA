package es.Daniel_Gil_Ejercicios_Clases_Abstractas;

import java.util.Calendar;

public abstract class Empleado {
	public Empleado(String nombre, String apellido, String dni, int fecha) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fecha = fecha;
		
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public int getFecha() {
		return fecha;
	}
	
	 abstract public String getSalario();
	 
	 abstract public double remuneracion();
	 
	 public String Imprimir() {
		 return this.nombre + " "+ this.apellido +   " " + this.dni +  " " + this.fecha;
	 }


	//Propiedades
	private String nombre;
	private String apellido;
	private String dni;
	private int fecha;
	

}


class EmpleadoAsalariado extends Empleado{

	public EmpleadoAsalariado(String nombre, String apellido, String dni, int fecha) {
		super(nombre, apellido, dni, fecha);
		this.salario = salario;
	}

	public double getSali() {
		
		Calendar ahora = Calendar.getInstance();
		int agno_actual = ahora.get(Calendar.YEAR);
		this.antiguedad = agno_actual - getFecha();
		
		if (antiguedad < 2) {
			salario = 900;
		}else if (antiguedad >= 2 && antiguedad <= 3) {
			
			incentivo = (900*7)/100;
			salario = 900;
			salario += incentivo;
			
		}else if (antiguedad >= 4 && antiguedad <= 8) {
			
			incentivo = (900*11)/100;
			salario = 900;
			salario += incentivo;
			
		}else if (antiguedad >= 9 && antiguedad <= 15) {
			
			incentivo = (900*17)/100;
			salario = 900;
			salario += incentivo;
			
		}
		
		return salario;
		
		
		
	}
	

	@Override
	public String getSalario() {
		
		return this.getNombre() + " " + this.getApellido() + "." + " DNI: " + this.getDNI() + ", año de alta: " + this.getFecha() + " salario fijo: " +this.getSali();
	}
	
	
	@Override
	public double remuneracion() {
		// TODO Auto-generated method stub
		return this.salario;
	}
	
	//Propiedades
	private double salario;
	private int antiguedad;
	private double incentivo;
	private double calculo;
	
	
	
	
	
}
class EmpleadoComision extends Empleado{

	public EmpleadoComision(String nombre, String apellido, String dni, int fecha, int clientes, double comision) {
		super(nombre, apellido, dni, fecha);
		this.clientes = clientes;
		this.comision= comision;
		//this.cobro = cobro;
	}
	
	
	public void setClientes(int clientes) {
		this.clientes = clientes;
	}
	
	public int getClientes() {
		return clientes;
	}
	
	
	public void setComision( double comision) {
		this.comision = comision;
	}
	
	public double getComision() {
		return comision;
	}
	
	public double CalculoSalario() {
		this.salario = 950;
		this.salario = 950 * comision;
		
		return salario;
		
	}

	@Override
	public String getSalario() {
		// TODO Auto-generated method stub
		return  this.getNombre() + " " + this.getApellido() + "." + " DNI: " + this.getDNI() + ", año de alta: " + this.getFecha() + " " +this.getClientes() + " clientes captados a:"
				+ " " +  " " + this.getComision() + " cada uno.";
	}
	
	public double remuneracion() {
		// TODO Auto-generated method stub
		return this.salario;
	}
	
	
	//Propiedades
	private int clientes;
	private double salario;
	private double comision;
	private double nomina;
	
	
}
