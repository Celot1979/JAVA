package es.DanielGil.POO;

public class Vehiculos {
	
	//1º Creamos un constructor.
	//Debe de llamarse igual que la clase donde está
	// creado, por ejemplo en nuestro ejemplo
	//Vehiculos
	
	public Vehiculos(int ruedas) {
		//1ºConstructor de la clase
		
		//3º Estado inicial del objeto
		
		this.ruedas = ruedas;
		largo = 2;
		ancho = 1;
		peso = 2;
		color = "sin color";
		
		
	}
	
	/* En el video 44 también nos enseña lo que sería la sobrecarga en los constructores
	 * Sería creando otro constructor para un vehículo diferente con propiedades diferentes
	 */
	public Vehiculos(int ruedas, int largo, double ancho, int peso) {
		
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
		this.peso = peso;
		color = "sin color";
		
		
	}
	
	// Vamos a crear aquí el 1º método sobrecargado(Lección sobrecarga de método -propiedades)
	
	public void setExtra(boolean climatizador) {
		this.climatizador = climatizador;
		
	}
	
	/*Al final del video nos explicar lo que es tener sobrecarga de metodos
	que es que podamos tener otro método que se llame igual que otro construido, pero 
	para que funcione sólo tiene que tener una caracteristica, que tenga más propiedades
	*/
	
	public void setExtra(boolean gps, boolean climatizador,boolean tapiceria_cuero) {
		
		// Comenzamos el video 44 2ª parte de sobrecarga completando el método setters 2
		this.climatizador = climatizador;
		this.gps=gps;
		this.tapiceria_cuero= tapiceria_cuero;
	}
	
	public String getExtra() {
		/*Aquí esta realmente donde se efectua la sobre carga, pues hay que cambiar la lógica
		 * y tener 3 posibilidades, que tenga sólo el climatizador, los tres extras ó que la combinación sea erronea
		 */
		if (climatizador && gps==false && tapiceria_cuero==false) return "Tu vehiculo lleva el pack 1 de extras.Tiene climatizador";
		else if(climatizador && gps && tapiceria_cuero) return "Tu vehiculo lleva el pack 2 de extras.Tiene climatizador,gps,tapiceria";
		else return "La combianción de extras no se admite";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void setColor(String color) {
		/* 4º Creamos este método llamado
		 * SETTER,Establece el valor de la propiedad
		 * que está en el constructor
		 */
		
		//color = "azul";
		this.color = color;
		
		
	}
	
	
	
	public String getColor() {
		/* 5º Devuelve el valor de la propiedad
		 * 
		 */
		return color;
		
		
		
		
	}
	
	
	//-----------------------------------------------------------------------------
	/* Vamos a crear un método de tipo getter para que devuelva un mensaje 
	 * referente a las ruedas
	 */
	public String getDatosVehiculo() {
		return "Tu vehiculo tiene " + ruedas + " ruedas. Además" + 
	" tiene " + largo + " m de largo";
		
		
		
		
	}
	
	 
	
	
	
	//---------------------------------------------------------------------------
	//2ºAhora vamos a crear propiedades
	// Tener en cuenta que se están creando fuera
	// de el constructor.
	private int ruedas; /*Estas propiedades o métodos van a estar
	encapsulados.Así sólo será accesible desde la clase
	vehiculos actual*/
	
	private String color;
	
	private int largo;
	
	private double ancho;
	
	private int peso;
	
	// Lección sobrecarga - Propiedades optativas
	private boolean climatizador;
	private boolean tapiceria_cuero;
	private boolean gps;
	

}
