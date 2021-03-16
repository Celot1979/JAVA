package es.Daniel_Gil_Libro_Java_Herencia_Geometrica;
import es.Daniel_Gil_Calculos_Areas.Calculo_Area_Circulo;

public class Operaciones implements Cloneable  {
	
	public Operaciones() {
		this.color = color;
		this.relleno = relleno;
		
	}
	
	public Operaciones(String c, boolean r) {
		color = c;
		relleno = r;
		
	}
	
	public String getColor() {
		return "El color de la figura es: " + color;
	}
	
	public void setColor(String cam) {
		color = cam;
	}
	
	
	
	public String getRelleno() {
		if (relleno == false) {
			salida = "Falso";
		}else {
			salida = "Verdadero";
		}
		return ". El relleno de la figura es: " + salida;
	}
	
	
	
	public String toString() {
		return "Soy una figura de color " + color + " y rellena o no rellena " + salida;
	}
	
	public Operaciones clone() {
		
		Operaciones clon = new Operaciones(this.color, this.relleno);
		return clon;
		
	}
	
	
	//Propiedades
	
	private String color = "rojo";

	private boolean relleno = true;
	private String salida;


}



class Circulo extends Operaciones{
	public Circulo(String c, boolean r, double ra) {
		super(c,r);
		radio = ra;
		
		
	}
	
	public Circulo(double ra) {
		radio = ra;
	}
	
	public Circulo() {
		radio = 1;
	}
	
	
	public String getRadio() {
		return "El radio del circulo es: " + radio + " cm";
	}
	
	
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	public void setArea() {
		resultado = Math.PI * (radio * 2);
	}
	
	public String getArea() {
		return "El area del circulo es: " + resultado;
	}
	
	
	public void setPerimetro() {
		
		radio = radio *radio;
		longitud = Math.PI * radio;
	}
	
	public String getPerimetro() {
		return "ELa longitud del circulo es: " + longitud;
	}
	
	
	public String toString() {
		return "Soy un circulo con radio:  " + radio + " esta es mi superclase Operaciones " + super.toString();
	}



	//Propiedades
	private double radio;
	private double resultado;
	private double longitud;
}




class Cuadrado extends Circulo{

	public Cuadrado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(double la) {
		super(la);
		// TODO Auto-generated constructor stub
	}

	public Cuadrado(String c, boolean r, double l) {
		super(c, r, l);
		// TODO Auto-generated constructor stub
	}
	
	

	public void setLado(double lado) {
		resultado = lado * lado;
	}
	
	public String getLado() {
		return "El área del cuadrado es: " + resultado;
	}
	
	
	//Propiedades
	private double lado;
	private double resultado;

	
}