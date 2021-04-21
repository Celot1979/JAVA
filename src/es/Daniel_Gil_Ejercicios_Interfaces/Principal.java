package es.Daniel_Gil_Ejercicios_Interfaces;

import java.util.Date;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehiculo objetos []= new Vehiculo[5];
			
			objetos[0]= new Coche(70);
			objetos[1]= new Moto(50);
			objetos[2]= new Moto(100);
			objetos[3]= new Coche(90);
			objetos[4]= new Coche(100);
	
	
	for(Vehiculo v : objetos) {
		System.out.println(v.plazas());
		v.acelerar(50);
		v.frenar(30);
		System.out.println("-----------------------");
		
	}
		
	}

}

class Coche implements Vehiculo{
	public Coche(int ini) {
		velocidad_inicial = ini;
	}
	
	public String getVelocidad_inicial() {
		return "La velocidad inicial es: " + velocidad_inicial;
	}
	
	public int velocidad_Maxima(int velo) {
		// TODO Auto-generated method stub
		 velocidad_Maxima = velo;
		return velocidad_Maxima;
	}
	@Override
	public String plazas() {
		// TODO Auto-generated method stub
		plazas = 5;
		//System.out.println("Las plazas que tiene el vehiculo son:"  + " " + plazas + " asientos");
		return "Las plazas que tiene el vehiculo son:"  + " " + plazas + " asientos";
	}
	

	@Override
	public int acelerar(int sub) {
		acelerar = sub;
		velocidad = velocidad_inicial + acelerar;
		if (velocidad > 120) {
			System.out.println("Has superado la velocidad Máxima permitida");
		}else if(velocidad == 0){
			System.out.println("El vehiculo está parado");
		}else {
			System.out.println("Velocidad correcta " + velocidad + " km/h");
		}
		return velocidad;
	}

	@Override
	public int frenar(int fr) {
		frenar = fr;
		velocidad = velocidad - frenar;
		if(velocidad == 0) {
			System.out.println("El vehículo está detenido" + velocidad);
		}else{
			System.out.println("El vehículo después de ser frenado mantiene :" + velocidad + " Km/h");
		}
		return velocidad;
	}
	
	
	
	
	private int velocidad_inicial;
	private int velocidad_Maxima;
	private int acelerar;
	private int frenar;
	private int velocidad;
	private int plazas;
	
	
	
	
}





class Moto extends Coche {

	public Moto(int ini) {
		super(ini);
		// TODO Auto-generated constructor stub
	}
	
	public String plazas() {
		plazas = 2;
		//System.out.println("Las plazas que tiene el vehiculo son:" + plazas);
		return "Las plazas para este vehículo son: " + "" + plazas + " plazas";
	}
	
	
	
	private int plazas;
	
}