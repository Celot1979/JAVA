package es.Daniel_Gil_Libro_Java_Herencia_Geometrica;
import es.Daniel_Gil_Calculos_Areas.Calculo_Area_Circulo;

public class Funcionamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones F1 = new Operaciones();
		
		System.out.println(F1.getColor() + F1.getRelleno());
		
		System.out.println("-------------------------------------------------------------- SOBREESCRITURA DEL MÉTODO TOSTRING ------------------------------------------------------------------");
		
		System.out.println(F1.toString());
		
		
        System.out.println("-------------------------------------------------------------- CLONACIÓN DE UN OBJETO FIGURA ------------------------------------------------------------------");
		
		Operaciones F2 = F1.clone();
		System.out.println(F2.getColor() + F2.getRelleno());
		
		
		 System.out.println("-------------------------------------------------------------- OBJETOS CIRCULOS ------------------------------------------------------------------");
		 
		 
		 Circulo c1 = new Circulo();
		 System.out.println("Constructor inicial");
		 System.out.println(c1.getColor() + " " + c1.getRelleno() + " " + c1.getRadio());
		 
		 
		 System.out.println("Constructor Implementando el radio");
		 Circulo c2 = new Circulo(34.5);
		 System.out.println(c2.getColor() + " " + c2.getRelleno() + " " + c2.getRadio());
		 
		 
		 System.out.println("Clonando el circulo");
		 
		 Operaciones c3 = c1.clone();
		 System.out.println(c3.getColor() + " " + c3.getRelleno());
		 
		 System.out.println("--------------------------------------------------------------Generando un nuevo objeto y usado un setters automatico ------------------------------------------------------------------");
		 
		 Circulo c4 = new Circulo(22.5);
		 c4.setColor("Verde");
		 System.out.println(c4.getColor() + " " + c4.getRelleno() + " " + c4.getRadio());
		 
		 
		 System.out.println("-------------------------------------------------------------- Calculo del area y del perimetro ------------------------------------------------------------------");
		  c1.setArea();
		  c1.setPerimetro();
		  c2.setArea();
		  c1.setPerimetro();
		  c4.setArea();
		  c4.setPerimetro();
		  
		  System.out.println(c1.getArea() + c1.getPerimetro());
		  
	      System.out.println("-------------------------------------------------------------- Sobreescribir el método toString en circulo ------------------------------------------------------------------");
	      
	     System.out.println( c4.toString());
	     
	     
	     
	     System.out.println("-------------------------------------------------------------- Objetos de tipo cuadrado------------------------------------------------------------------");
		 
	     Cuadrado cu1 = new Cuadrado();
	     cu1.setLado(2.2);
	     System.out.println(cu1.getLado());
	     
	}

}
