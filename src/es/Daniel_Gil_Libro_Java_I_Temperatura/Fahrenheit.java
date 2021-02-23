package es.Daniel_Gil_Libro_Java_I_Temperatura;

public class Fahrenheit {
	
	public Fahrenheit(double f) {
		
		fahrenheit = f;
	}
	
	public String getFahrenheit() {
		
		return "Los grados en fahrenheit: " + fahrenheit;
	}
	
	public double getConvertirCelsius() {
		
		celsius = (fahrenheit - 32)* 5/9;
		
		return celsius;
	}
	
	
	
	
	
	
	
	
	
	private double celsius;
	private double fahrenheit;

}
