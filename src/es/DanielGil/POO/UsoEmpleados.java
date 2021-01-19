package es.DanielGil.POO;

public class UsoEmpleados {

	public static void main(String[] args) {
		//Creación del objetoj
		
		
		Empleados empleado1 = new Empleados("Ana");
		
		//Instanciación de métodos
		System.out.println(empleado1.getDatosEmpleados());
		
		empleado1.setSeccion("RRHH");
		System.out.println(empleado1.getDatosEmpleados());
		
		// Comienza aquí la explicación del método Static. Nos manda crear un objeto
		//Posteriormente accedemos al método getter para conocer lo datos de esté último
		//objeto
		Empleados empleado2 = new Empleados("Antonio");
		System.out.println(empleado2.getDatosEmpleados());
		
		/*Vamos a crear un nuevo objeto(empleado) para revisar que
		 * le da otro número de empleado automaticamente usando el método
		 * Static
		 */
		Empleados empleado3 = new Empleados("Sandra");
		System.out.println(empleado3.getDatosEmpleados());
		System.out.println(Empleados.getIdSiguiente());
		

	}

}


class Empleados{
	//Constructor
	//En la 1ª clase del método Static, nos mandan 
	public Empleados(String nombre) {
		this.nombre= nombre;
		seccion ="Administracion";
		Id =IdSiguiente;
		IdSiguiente++;
		
		
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatosEmpleados() {
		return "El empleado " + nombre + " pertenece a la sección " + seccion + " el nª empleado es " + Id ;
	}
	
	/*Para poder aprender sobre la creación de los métodos STATIC (Video 47, 2ª parte),
	 * El enunciado nos dice que a parte de la información de cada empleado(objetos instanciados),
	 * y de sus IDs( variable de clase). Debemos también saber  el prox ID que se le asignará
	 * al prox empleado(método Static)
	 */
	
	public static String getIdSiguiente() {
		return "El Id del sigueinte empelado será: " + IdSiguiente;
	}
	
	
	// Propiedades
	private final String nombre;
	/*
	 * Para pasar de varable a una constante, puesto que le nombre de un objeto
	 * es muy dificil que cambie, es poner la plabra reservada final delante del
	 * tipo de variable que era....
	 * En esté caso es un String nombre...
	 * Pues sería final String nombre
	 */
	private String seccion;
	
	// En la lección de Static, 1º creamos una variable private
	private int Id;
	/*A continuación crearemos una VARIABLE DE CLASE. Que es una 
	 * una variable del método static
	 */
	private static int IdSiguiente = 1;
}
