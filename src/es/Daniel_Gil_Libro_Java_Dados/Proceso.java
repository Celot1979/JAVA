package es.Daniel_Gil_Libro_Java_Dados;

import java.util.Scanner;

public class Proceso {
	
	public Proceso() {
		Scanner d = new Scanner(System.in);
		System.out.println("Cuanto dinero quieres depositar: ");
		deposito = d.nextInt();
		
	}
	
	
	public String getDeposito() {
		return "El jugador ha depositado: " + deposito;
	}
	
	public void setApuesta() {
		Scanner a = new Scanner(System.in);
		System.out.println("Cuanto dinero quieres depositar: ");
		apuesta = a.nextInt();
		
		if (apuesta > deposito) {
			System.out.println("No se admite esa apuesta por falta de fondos"); 
		}
		
		
	}
	
	
	public void setTiradas() {
		Dado1 = (int)(Math.random()*6+1);
		Dado2 = (int)(Math.random()*6+1);
		Dado3 = (int)(Math.random()*6+1);
	}
	
	
	public String getTiradas() {
		return "Los dados ha dado como resultado: " + Dado1 + " "+ Dado2 + " "+ Dado3;
	}
	
	
	public void setJugadas() {
		if(Dado1 == 6 && Dado2 ==6 && Dado3 == 6) {
			deposito = deposito + (apuesta * 5);
		}else if (Dado1 == Dado2 && Dado2 == Dado3) {
			deposito = deposito + (apuesta * 3);
		}else if(Dado1 == Dado2 && Dado2 != Dado3) {
			deposito = deposito + (apuesta * 2);
		}else if(Dado1 == Dado3 && Dado1 != Dado2) {
			deposito = deposito + (apuesta * 2);
		}else if (Dado1 != Dado2 && Dado1 != Dado3) {
			deposito = deposito - apuesta;
		}else if (Dado2 != Dado3 && Dado2 != Dado3) {
			deposito = deposito - apuesta;
		}
	}
	
	
	public String getJugadas() {
		return "El jugador tiene en el deposito: " + deposito;
	}
	
	
	
	
	
	
	
	private int deposito;
	private int apuesta;
	private int Dado1;
	private int Dado2;
	private int Dado3;
	private int opcion;

}
