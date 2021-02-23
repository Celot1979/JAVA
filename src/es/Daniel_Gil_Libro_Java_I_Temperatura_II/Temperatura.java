package es.Daniel_Gil_Libro_Java_I_Temperatura_II;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Convertir obj1 = new Convertir();
		int p3 = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas converir medidas de temperatura? :\n(pulsa 1. Celsius - Fahrenheit)\n (pulsa2. Fahrenheit - Celsius) "));
		
		if(p3 ==1) {
			
			 obj1.setFahrenheit();
			 JOptionPane.showMessageDialog(null, obj1.getFahrenheit());
	}else if (p3 == 2) {
		
		obj1.setCelsius();
		JOptionPane.showMessageDialog(null, obj1.getCelsius());
		
		
	}else {
		JOptionPane.showMessageDialog(null, "ERROR vuelva a empezar");
	}
		
	}

}
class Convertir{
	
	public Convertir( ) {
		celsius = 0;
		fahrenheit = 0;
	}
	
	
	public void  setFahrenheit(){
		
		double p1= Integer.parseInt(JOptionPane.showInputDialog("Que numero de grados deseas convertir a fahrenheit: "));
		
		celsius = p1;
		
		fahrenheit=(celsius * 9/5) + 32 ;
		
	}
	
	
	public String getFahrenheit() {
		
		return " Los grados convertidos de celsius a fahrenheit son: " + fahrenheit;
		
	}
	
	
	public void setCelsius(){
		
		double p2= Integer.parseInt(JOptionPane.showInputDialog("Que numero de fahrenheits deseas convertir a celsius: "));
		
		fahrenheit = p2;
		
		celsius =(fahrenheit - 32)* 5/9;
		
	}
	
	public String getCelsius() {
		return " Los grados convertidos de fahrenheit a celsius son: " + celsius;
	}
	
	
	private double celsius;
	private double fahrenheit;
	
	
	
	
	
	
}