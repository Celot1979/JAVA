package es.Daniel_Gil_Libro_Java_Restaurante;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Restaurant  R1 = new Restaurant(12, 20.0);
		
		System.out.println(R1.getExistencias());
		
		R1.setNum_Platos(3);
		System.out.println(R1.getNumero_Huevos());

	}

}

class Restaurant{
	
	public Restaurant(int doce, double cho) {
		chorizos = cho;
		docenas = doce;
		huevos = docenas * 12;
		gramos = chorizos * 1000;
	}
	
	
	public void addHuevos(int cat) {
		docenas += cat;
		
	}
	
	
	
	
	public void addChorizos(double chori) {
		chorizos += chori;
		
	}
	
	
	public String getExistencias() {
		return "Tenemos " + docenas + " docenas" + " que en huevos son: " + huevos + "\n Tenemos " + chorizos + " kg " + " que en gramos son: " + gramos ;
	}
	
	
	
	
	public void setNum_Platos(int pl) {
		
		hue = pl *2;
		huevos = huevos - hue;
		chor = pl *200;
		gramos = gramos- chor;
		chorizos =gramos / 1000;
		
	}
	
	public String getNumero_Huevos() {
		return "Los huevos que quedan son: " + huevos + " \nLos kg de chorizo  son: " + chorizos + " Kgs";
		}
	
	private double chorizos;
	private int docenas;
	private int huevos;
	private double gramos;
	private int platos;
	private int hue;
	private double chor;
}
