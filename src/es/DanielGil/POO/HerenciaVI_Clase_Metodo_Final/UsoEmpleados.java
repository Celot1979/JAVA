package es.DanielGil.POO.HerenciaVI_Clase_Metodo_Final;

import java.util.GregorianCalendar;



public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jefes Juan = new Jefes("Juan", 8000, 2013, 8,5);
		Juan.setIncentivo(200);
		
		
        Empleados [] losEmpleados = new Empleados[6];
		
		losEmpleados[0]= new Empleados("Antonio", 2300.5, 2005, 7, 15);
		losEmpleados[1]= new Empleados("Carlos", 5000.5, 2001, 2, 15);
		losEmpleados[2]= new Empleados("Vero", 1500.5, 2018, 2, 15);
		losEmpleados[3]= new Empleados("Adrian", 1800, 2003, 12, 5);
		losEmpleados[4]= Juan;
		
		//##############################################################################################################
		//### 2º Explicacion del Casting objetos( UpCasting - DownCasting ########
		
		losEmpleados[5]= new Jefes("Isabel", 8000, 2007,4,7);
		
		//Si deseamos darle un incentivo como jefa, vamos a tener que usar el DownCasting:
		
		
		Jefes Isabel = (Jefes) losEmpleados[5];
		Isabel.setIncentivo(200);
		
		//##############################################################################################################
		//### 1º Explicacion del Casting objetos( UpCasting - DownCasting #############################################################################
		// Código para ver la lección del Casting de objetos
		
		//UpCasting
		
		/*Jefes Patricia = new Jefes("Patricia", 2550, 2007,5,3);
		
		Empleados PatriciaSecretaria= Patricia;
		
		
		//DownCasting
		
		Empleados Ramon = new Jefes("Ramon", 1500,2011,7,3);
		
		Jefes RamonPerito = (Jefes)Ramon;*/
		
		//##############################################################################################################
		//##############################################################################################################
		
		
		
		for(Empleados obj : losEmpleados) {
			System.out.println(obj.getDatosEmpleados() + " y un salario de: " + obj.getSueldo());
			
		}
		
		
		

	}

}

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
		/*final public double getSueldo()
		 * El usar la palabra reservada - final - en un método
		 * normalmente se usa para diferenciarlo de otro método sobreescrito
		 * en un clase que hereda. Usando está palabra se consigue
		 * que tan sólo se pueda usar el método que está en la super class
		 * y en la heredada dará fallo.*/
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




class Jefes extends Empleados{
	/*final class Jefes extends Empleados{
	si ponemos delante de la class la palabra reservada - final - 
	romperemso la herencia y no será accesible para las clases sigueintes a ella
	tampoco sería acceserible por otro programador.
	Si pusieramos ese modificador, veráimos que la calse sigueinte- Directores- nos daría un error.*/

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


/*class Directores extends Jefes{

	public Directores(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
}*/
