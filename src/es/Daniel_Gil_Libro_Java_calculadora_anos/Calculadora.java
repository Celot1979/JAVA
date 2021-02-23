package es.Daniel_Gil_Libro_Java_calculadora_anos;

import java.util.GregorianCalendar;
import java.util.Scanner;



public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Introduce el año de tu nacimiento: ");
		int Agno_nacimiento =  entrada1.nextInt();
		
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce el mes de nacimiento: ");
		int Mes_nacimiento =  entrada2.nextInt();
		
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Introduce el dia de tu nacimiento: ");
		int Dia_nacimiento =  entrada3.nextInt();
		
		
		Calcu Fecha_Persona = new Calcu( Agno_nacimiento, Mes_nacimiento, Dia_nacimiento);
		
		System.out.println(Fecha_Persona.getFecha());
		
		System.out.println(" ------------------------------ ------------------------------");
		
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Introduce el año actual: ");
		int Agno_actu =  entrada4.nextInt();
		
		
		Scanner entrada5 = new Scanner(System.in);
		System.out.println("Introduce el mes actual: ");
		int Mes_actu =  entrada5.nextInt();
		
		
		Scanner entrada6 = new Scanner(System.in);
		System.out.println("Introduce el dia actual: ");
		int Dia_actu =  entrada6.nextInt();
		
		
		Fecha_Persona.setActual(Agno_actu, Mes_actu, Dia_actu );
		System.out.println(" ------------------------------ ------------------------------");
		System.out.println(Fecha_Persona.getFecha_actual());
		
		Fecha_Persona.setAgnos();
		Fecha_Persona.setMes();
		Fecha_Persona.setDias();
		
		
		System.out.println(Fecha_Persona.getDatos());
		
		

	}

}

class Calcu{
	
	
	public Calcu(int a, int m, int d) {
		agno = a;
		mes =m;
		dia =d;
		
		
	}
	

	
	
	
	public String getFecha() {
		
		
		return "Tu fecha de nacimiento es: " + dia + " " + mes +  " " + agno;
	}
	
	//---------------------------------------------------- FECHA DE LA PERSONA -------------------------------------------------------------------------------------------------
	public void setActual(int ag, int me, int di) {
		year = ag;
		moth =me;
		days = di;
	}
	
	
	public String getFecha_actual() {
		return "La fecha actual es : " + year + " " +  moth +  " " + days;
		
	}
	
	
	public void setAgnos() {
		//System.out.println(agno);
		//System.out.println(year);
		ano_actual = year - agno ;
	}
	
	
	public void setMes() {
		if (moth <= 12 || mes <= 12) {
			mes_actual = this.mes - this.moth;
		}else if(moth < 0 || mes < 0) {
			System.out.println("Error");
			
		}
		
		
		
		
		
		
	}
	
	public void setDias() {
		if(days <= 31 || dia <= 31) {
			dia_actual = this.days - this.dia;
		}else if(days < 0 || dia < 0) {
			System.out.println("Error");
		
	}
	}
	
	
	public String getDatos() {
		return "Tu edad es: " + ano_actual + " " + mes_actual + " " + dia_actual;}
	
	
	
	
	
	private int agno;
	private int mes;
	private int dia;
	
	private int year;
	private int moth;
	private int days;
	
	private int ano_actual;
	private int mes_actual;
	private int dia_actual;
	
	
	
}

