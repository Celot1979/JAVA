package es.Daniel_Gil_Libro_Java_Animal_Clone_Equeals;

public class Interno implements Cloneable  {
	public Interno(String n, int e) {
		Nombre = n;
		Edad = e;
		c = contador;
		contador++;
	}
	
	
	
	public Interno(Interno a1) {
		// TODO Auto-generated constructor stub
		Nombre = a1.Nombre;
		Edad = a1.Edad;
		
	}



	public void setCambiarNombre(String no) {
		Nombre = no;
	}
	
	public String getNombre() {return "El nombre del animal es: " + Nombre;	}
	
	public String getContador() {
		return "El numero del animal es: " + c;
	}
	
	public void setCambiarEdad(int ed) {
		Edad = ed;
	}
	
	public String getEdad() { return "La edad del animal es: " + Edad;}
	
	public Interno clone() {
		Interno clon = new Interno(this.Nombre,this.Edad);
		return clon;
	}
	
	public boolean equals(Object obj) {
		Interno p= (Interno)obj;
		 
		return p.getNombre().equals(this.getNombre());
		 
		}
	
	
  
	
	
	//Propiedades
	
	private String Nombre;
	private int Edad;
	private static int contador = 1;
	private int c;
	



/*1º Para trabajar con metodos clonados, debemos crear una clase como habitualmente lo hacemos, pero añadiendo -implemnts Clonable-. Esto hacer al sistema saber que se añadirá un método para clonar
el objeto.abstract
2º Creamos el constructor con normalidad y los setters y getters que deseemos con el fin de hacer funcionar el programa.abstract
3º Crearemos un metodo clone(). Dentro de él crearemos una simulación de instaciación de un nuevo objeto ( como si estuvieramos en el método MAIN). Con un retorno de la clonación 

SE SIGUE EN LA CLASE MAIN*/


}



class Perro extends Interno{

	public Perro(String n, int e, String r) {
		super(n, e);
		raza = r;
		// TODO Auto-generated constructor stub
	}
	
	public void setRaza(String ca) {
		raza= ca;
	}
	public String getRaza() {
		return "La raza del perro es: " + raza;
	}
	//Propiedades
	private String raza;
	
}

class Gato extends Interno{

	public Gato(String n, int e) {
		super(n, e);
		this.vidas = vidas;
		// TODO Auto-generated constructor stub
	}
	
	public String getVidas() {
		return "El gato tiene: " + vidas + " vidas";
	}
	
	public void setVidas(int n) {
		vidas = vidas - n;
	}
	//Propiedades
	private int vidas = 7;
	
}

