package es.Daniel_Gil_Libro_Java_Tragaperras;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tragaperras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Traga j = new Traga();
		//j.setEvaluacion_Dinero();
		//j.setTirada();
		//System.out.println(j.getTirada());
		//j.setCombinacion();
		j.setResumen();
		

	}

}
class Traga{
	public Traga() {
		try {
			Scanner c = new Scanner(System.in);
			System.out.println("Qué cantidad quieres depositar: \n ");
			cantidad = c.nextDouble();
			
			
		}catch (InputMismatchException e){
			System.out.println("Sólo admite números enteros");
		}
		
	}
	
	public String getCantidad() {
		return "La cantidad depositada es: " + cantidad;
	}
	
	
	public void setEvaluacion_Dinero() {
		if (cantidad < 1 || cantidad > 50) {
			System.out.println("Esas cantidaddes no son validas. Debe de depositar 1 € hasta 50€");
		}else {
			getCantidad();
		}
	}
	
	public void setTirada() {
		tirada = (int)(Math.random()*2+1);
		tirada2 = (int)(Math.random()*2+1);
		tirada3 = (int)(Math.random()*2+1);
		
		
		
		if (tirada == 1) {
			caja1 = "Manzana";
		}else if(tirada == 2) {
			caja1 = "Naranja";
		}else if(tirada == 3) {
			caja1 = "Fresa";
		}else if(tirada == 4) {
			caja1 = "Cereza";
			
		}else if(tirada == 5) {
			caja1 = "Limón";
		}else if (tirada == 6) {
			caja1 = "Sandia";
		}
		//System.out.println(caja1);
		
		if (tirada2 == 1) {
			caja2 = "Manzana";
		}else if(tirada2 == 2) {
			caja2 = "Naranja";
		}else if(tirada2 == 3) {
			caja2 = "Fresa";
		}else if(tirada2 == 4) {
			caja1 = "Cereza";
			
		}else if(tirada2 == 5) {
			caja2 = "Limón";
		}else if (tirada2 == 6) {
			caja2 = "Sandia";
		}
		
		
		if (tirada3 == 1) {
			caja3 = "Manzana";
		}else if(tirada3 == 2) {
			caja3 = "Naranja";
		}else if(tirada3 == 3) {
			caja3 = "Fresa";
		}else if(tirada3 == 4) {
			caja3 = "Cereza";
			
		}else if(tirada3 == 5) {
			caja3 = "Limón";
		}else if (tirada3 == 6) {
			caja3 = "Sandia";
		}
		

		}
		
		
		public String getTirada() {
			return "La combinación que ha salido es: " + caja1 + " - " + caja2 + " - " + caja3;
		}
	
		public void setCombinacion() {
			
			cantidad = cantidad - 0.50;
			if (tirada == 4 && tirada2 == 4 && tirada == 4) {
				cantidad = cantidad + 30;
				System.out.println("Enhorabuena has ganado 30€\nLa cantidad que tienes en total actualmente es:" + cantidad);
				
			}else if(tirada == 6 && tirada2 == 6 && tirada3 == 6) {
				cantidad = cantidad + 20;
				System.out.println("Enhorabuena has ganado 20€\nLa cantidad que tienes en total actualmente es:" + cantidad);
			}else if(tirada == 3 && tirada2 == 3 && tirada3 == 3) {
				cantidad = cantidad + 10;
				System.out.println("Enhorabuena has ganado 10€\nLa cantidad que tienes en total actualmente es:" + cantidad);
			}else if(tirada == 6 && tirada2 == 6 && tirada3 == 6) {
				cantidad = cantidad + 20;
				System.out.println("Enhorabuena has ganado 20€\nLa cantidad que tienes en total actualmente es:" + cantidad );
			}else if(tirada == 1 && tirada2 == 1 && tirada3 == 1) {
				cantidad = cantidad + 5;
				System.out.println("Enhorabuena has ganado 5€\nLa cantidad que tienes en total actualmente es:" + cantidad );
			}else if(tirada == 2 && tirada2 == 2 && tirada3 == 2) {
				cantidad = cantidad + 5;
				System.out.println("Enhorabuena has ganado 5€\nLa cantidad que tienes en total actualmente es:" + cantidad);
			}else if(tirada == 5 && tirada2 == 5 && tirada3 == 5) {
				cantidad = cantidad + 5;
				System.out.println("Enhorabuena has ganado 5€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if (tirada == 4 && tirada2 == 4 && tirada3 != 4) {
				cantidad = cantidad + 3;
				System.out.println("Enhorabuena has ganado 3€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
				
			}else if(tirada != 4 && tirada2 == 4 && tirada3 == 4) {
				cantidad = cantidad + 3;
				System.out.println("Enhorabuena has ganado 3€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if(tirada == 4 && tirada2 != 4 && tirada3 == 4) {
				cantidad = cantidad + 3;
				System.out.println("Enhorabuena has ganado 3€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if(tirada == 6 && tirada2 == 6 && tirada3 != 6) {
				cantidad = cantidad + 2;
				System.out.println("Enhorabuena has ganado 2€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if(tirada == 6 && tirada2 != 6 && tirada3 == 6) {
				cantidad = cantidad + 2;
				System.out.println("Enhorabuena has ganado 2€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if(tirada != 6 && tirada2 == 6 && tirada3 == 6) {
				cantidad = cantidad + 2;
				System.out.println("Enhorabuena has ganado 2€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if(tirada == tirada2 && tirada != tirada3) {
				cantidad = cantidad + 1;
				System.out.println("Enhorabuena has ganado 1€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if(tirada != tirada2 && tirada == tirada3) {
				cantidad = cantidad + 1;
				System.out.println("Enhorabuena has ganado 1€\nLa cantidad que tienes en total actualmente es:"  + cantidad);
			}else if(tirada != tirada2 && tirada != tirada3) {
				cantidad = cantidad - 0.5;
				System.out.println("Has perdido\nLa cantidad actual es :"  + cantidad);
			}
		}
		
		
		public void setResumen() {
			
			jugar = 1;
			while (cantidad > 0 && jugar == 1) {
				setEvaluacion_Dinero();
				setTirada();
				System.out.println(getTirada());
				setCombinacion();
				Scanner j = new Scanner(System.in);
				System.out.println("Desea seguir jugando:\n1.si\n2.no");
				jugar = j.nextInt();
				if (jugar == 1) {
					continue;
				}else if (jugar == 2) {
					jugar = 2;
				}
			}
		}
			
			
			
	
	
	
	
	//Propiedades
	private double cantidad;
	private int tirada;
	private int tirada2;
	private int tirada3;
	private String caja1;
	private String caja2;
	private String caja3;
	private int jugar;
}