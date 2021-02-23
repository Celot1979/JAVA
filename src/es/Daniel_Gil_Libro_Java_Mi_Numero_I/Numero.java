package es.Daniel_Gil_Libro_Java_Mi_Numero_I;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number N1 = new Number(5);
		System.out.println(N1.getCambio());
		N1.setCambio(8);
		System.out.println(N1.getCambio());
		N1.setResta(2);
		
		System.out.println(N1.getResultado_Resta());
		
		
		
        N1.setValor_Cuadruple();
		
		System.out.println(N1.getValorCuadruple());
		

	}

}
class Number{
	
	
	private String resultado;





	public Number () {
		
		number = 0;
	}
	
	public Number(int n) {
		number=n;
	}
	
	public void setCambio(int c) {
		number = c;
		
	}
	
	public String getCambio() {
		return "El numero ha cambiado. Ahora tenemos como número el: "
 + number;	}
	
	public void setResta(int rest) {
		
		number -= rest; // Para realizar la operación de restar y que el código sea más abreviado
		// Sería como escribir number = number - rest
	}
	
	public String getResultado_Resta() {
		return "El resultado de la resta es: " + number;
	}
	
	
    public void setSuma(int rest) {
    	number += rest; // Para realizar la operación de restar y que el código sea más abreviado
		// Sería como escribir number = number - rest
	}
	
	public String getResultado_Suma() {
		return "El resultado de la suma es: " + number;
	}
	
	
	public String getValorActual() {
		return "El valor actual es: " + number;
		
	}
	
	public void setValor_Doble() {
		int valor = number * 2;
		number = valor;
		
		
	}
	

	
	public String getValorDoble() {
		return "El valor doble del numero sería: " + number;
	}
	
	public void setValor_Triple() {
		int valor = number * 3;
		number = valor;
		
		
	}
	

	
	public String getValorTriple() {
		return "El valor triple del numero sería: " + number;
	}
	
	
	
	public void setValor_Cuadruple() {
		int valor = number * 4;
		number = valor;
		
		
	}
	

	
	public String getValorCuadruple() {
		return "El valor cuadruple del numero sería: " + number;
	}
	
	
	
	
	
	
	
	
	private int number;
	
	
	
	
}