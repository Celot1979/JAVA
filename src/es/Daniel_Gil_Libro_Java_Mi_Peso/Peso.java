package es.Daniel_Gil_Libro_Java_Mi_Peso;

public class Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medidas Ej1 = new Medidas(45.0, 0.0, 0.0);
		System.out.println(Ej1.getMedidas());
		
		Ej1.setLibras();
		System.out.println(Ej1.getResultado1());
		
		Medidas Ej2 = new Medidas(0.0, 50.0, 0.0);
		System.out.println(Ej2.getMedidas());
		
		Ej2.setKilos();
		System.out.println(Ej2.getResultadoKilos());
		
		

	}

}

class Medidas{
	public Medidas(double a,double b,double  c) {
		
		Kg = a;
		Lb = b;
		Oz = c;
		
		
	}
	
	public String getMedidas() {
		
		return "La medida en Kg " + Kg + " Kg" + " \nMedida en libras: " + Lb + " lb" + "\nMedida en onzas: " + Oz + " oz";
	}
	
	
	
	
	public void setLibras() {
		if (Kg> 0 && Oz == 0){
			Lb = Kg * 0.453591830542594;
		}else if (Kg == 0 && Oz > 0) {
			Lb = Oz * 16;
		}
		
	}
	
	public String getResultado1() {
		return "El resultado es: " + Lb;
	}
	
	
	public void setKilos() {
		
		if (Lb > 0 && Oz == 0) {
			Kg = Lb * 2.20462;
		}else if(Lb == 0 && Oz > 0) {
			Kg = Oz * 35.274;
		}
	}
	
	public String getResultadoKilos() {
		return "El resultado es: " + Kg;
	}
	
    public void setOnzas() {
    	if (Kg > 0 && Lb == 0) {
			Oz = Kg * 0.02834955374248;
		}else if(Kg == 0 && Lb > 0) {
			Lb = Oz * 0.0625;
		}
	}
	
	public String getResultadoOnzas() {
		return "El resultado es: " +  Oz;
	}
	
 
	
	
	
	
	
	
	
	private double Kg;
	private double Lb;
	private double Oz;
}