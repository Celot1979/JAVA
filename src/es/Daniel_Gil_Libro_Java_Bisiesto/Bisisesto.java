package es.Daniel_Gil_Libro_Java_Bisiesto;

import java.util.Scanner;

public class Bisisesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bi obj = new Bi();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el año: ");
		int p = entrada.nextInt();
		
		System.out.println(obj.setDatos(p));
		System.out.println(obj.getInfo());
		
		entrada.close();
		
		
		
		

	}

}
class Bi {
	public Bi() {
		this.agno = agno;
		this.condicional = condicional;
		
		
	}
	
	public boolean setDatos(int an) {
		agno = an;
		if (agno % 4 ==0) {
			if (agno % 100 != 0 || agno % 400 ==0) {
				//System.out.println("Bisiesto");
				return condicional = true;
			}else {
				//System.out.println("NO Bisiesto");
				return condicional = false;
				
				
			}
		}else {
			//System.out.println("NO Bisiesto");
			return condicional = false;
		}
		
	}
	
	
	
		
	
	public String getInfo() {
		
		
		return "El año introduccido es: " + agno + " y es: " + condicional;
		
	}
	
	
	
	
	
	
	
	
	private int agno;
	private boolean condicional = true;
	
}