package es.Daniel_Gil_Libro_Java_Animal;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sujeto A1 = new Sujeto("Bacalao", 11);
		
		System.out.println(A1.getNombre() + " " + A1.getEdad());
		
		Perro P1 = new Perro("Joselin", 3, "Colling");
		
		System.out.println(P1.getNombre() + " " + P1.getEdad() + " " + P1.getRaza());
		

	}

}

class Sujeto{
	
	public Sujeto(String n, int e) {
		nombre = n;
		edad = e;
	}
	
	
	public String getNombre() {
		return "El nombre del animal es:" + nombre;
		
	}
	
	public String getEdad() {
		return "La edad del animal es: " + edad;
	}
	private String nombre;
	private int edad;
}





class Perro extends Sujeto{

	public Perro(String n, int e, String r) {
		super(n, e);
		raza = r;
		
		// TODO Auto-generated constructor stub
	}
	
	public String getRaza() {
		return "La raza del perro es: " + raza;
	}
	
	private String raza;
	
}