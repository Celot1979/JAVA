package es.Daniel_Gil_Ejercicios_POO;

import java.util.Scanner;

public class Cuenta {
private static final String Systen = null;
//---------------------------------------------------------------------------------------------------
	// Creacion del constructor con parametros:
	public Cuenta(String nombreTitular, double saldo) {
		
		this.nombreTitular= nombreTitular;
		this.saldo = saldo;
		
		numeroCuenta= (int)(Math.random() * 1000);	
	}
	//-----------------------------------------------------------------------------------------------
	// Crearemos los setters:
	// Setters para ingresar:
	public void setIngresos(int ingreso) {
		this.saldo = saldo + ingreso;
	}
	
	public void setReitegro(int reintegro) {
		this.saldo = saldo - reintegro;
	}
	
	
	
	
	//-----------------------------------------------------------------------------------------------
	//Crear los getters para devolver la informacion:
	//En este caso para devolver el ingreso.
	public int getIngresos() {
		
		return (int) saldo;
	}
	
	
    
	public int getReitegro() {
		return (int) saldo;
	}
	
	
	
	//-----------------------------------------------------------------------------------------------
		//Crear los getters para devolver todo la informacion:
	
	public String getDatos() {
		return "La cuenta es " + numeroCuenta + " .El nombre es  " + nombreTitular + " su saldo actualmente es de " + saldo + " €";	
	
	
	
	}
	
	//-----------------------------------------------------------------------------------------------
	//Propiedades:
    private String nombreTitular;
    private double saldo;
    private long numeroCuenta;
}
