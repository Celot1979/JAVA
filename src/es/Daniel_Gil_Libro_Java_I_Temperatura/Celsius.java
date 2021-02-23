package es.Daniel_Gil_Libro_Java_I_Temperatura;

public class Celsius {
	
	public Celsius(double c) {
		
		celsius = c;
	}
	
	public String getCelsius() {
		return "Los grados son: " + celsius;	}
	
	

	
	public String getConvertirFaren() {
		fahrenheit = (celsius * 9/5) + 32 ;
		return " Los grados: " + celsius + " son en fahrenheit: " +  fahrenheit;
	}
	
	
	
	
	
	private double celsius;
	private double fahrenheit;
	
	

}
