package es.DanielGil.POO.HerenciaVII_Interfaz_I;

import java.util.Date;

public class Uso_Empleados {

	public static void main(String[] args) {
		Empleados Alba = new Empleados("Alba",new Date(5465454),2500.00);
		System.out.println(Alba.getNombre());
		
		System.out.println(Alba.getDescripcion());
		
		Jefes David = new Jefes("DAvid", new Date(5465454), 4800);
		David.setCargo("Director  de RRHH");
		System.out.println(David.getNombre());
		System.out.println(David.getDescripcion() + David.getCargo());

	}

}
