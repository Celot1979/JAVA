package es.DanielGil.POO.Herencia.I;

import java.util.GregorianCalendar;

public class UsoEmpleados {

	public static void main(String[] args) {
		/*En principio vamos a crear dos objetos. El primero de la clase empleado,
		 * y el segundo de la clase Jefes ( aúnque sabemos que sólo están inicializada
		 * y no contiene nada que pueda dar a entender que tenfa herencia de la 1ª
		 */
		
		Empleados Antonio = new Empleados("Antonio", 2300.5, 2005, 7, 15);
		
		Jefes Ana = new Jefes("Ana", 2900.5, 2008, 8, 9);
		
		System.out.println(Antonio.sueldo());  
		
		System.out.println(Ana.sueldo());
		
		// Que cosas
		
		

	}

}

//###########################################################################################################################
//###########################################################################################################################
//###########################################################################################################################
class Empleados{
	//Constructor
	/*Al usar un nombre distinto en los parámetros al de las propiedades
	 * no hace falta usar la palabra reservda THIS, al inicializar dentro
	 * del constructor.
	 * 
	 * En el caso del calendario estamos usando una librería con su método
	 * por tanto inicializamos la propiedad como la hemos creado más abajo.
	 * Seguidamente, paxra crear un nuevo calendario con el método debemos
	 * usar la palabra NEW ( como simpre que deseamos crear algo), y el 
	 * método que vamos a usar. En ese método por obligación debemos pasarle
	 * por parámetro ño, mes y día. OBSERVAR que lo hemos pasdo por parámentro
	 */
	
	public Empleados(String nom, double sue, int agno, int mes, int dia) {
		nombre= nom;
		sueldo= sue;
		calendario= new GregorianCalendar(agno, mes, dia);
		Id =IdSiguiente;
		IdSiguiente++;
		
		
	}
	//###############################################################################
	// Desde aquí, hasta el método setSubeSueldo. Son métodos que están
	//agredados en la 1ª clase de herencia.
	public double sueldo() {
		return sueldo;
	}
	
	/* En este método o comportamiento debemos crearlo siempre haciendo 
	 * referencia a la librería a la que pertenece, y luego método return.
	 */
	public GregorianCalendar getFechaAlta() {
		return calendario;
	}
	public String getDatosEmpleados() {
		return "El empleado " + nombre +  " tiene el ID:  " + Id ;
	}
	
	
	/* En el siguiente método queremos que se suba el sueldo un porcentaje 
	 * que podamos elegir nosotros( por tanto, tiene que ser con paso de pará
	 * metro).
	 * 
	 */
	public void setSubeSueldo(double porcentaje) {
		double aumento =sueldo*porcentaje/100;
		sueldo += aumento;
	}
	//###############################################################################
	//###############################################################################
	
	
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
		/* 1º Hemos añadido la palabra reservada para hacer una clase heredada - EXTENDS-.
		 * 2º Al hacerlo no salió un error en el cúal nos avisaba que no habíamos incluido el constructor
		 * de la clase Padre. Si pinchamos sobe el error nos sale la sigueinte opción:
		 * ADD CONSTRUCTOR JEFES(STRING NOM, DOUBLE SUE, INT AGNO, INT MES, INT DIA)
		 * 3º Al accdeder a ello, es cuando nos crea el constructor de la clase padre y en él se hace
		 * referencia gracias a la palabra SUPER
		 * 
		 */
	}
	
	
	
	
	
	
	
}