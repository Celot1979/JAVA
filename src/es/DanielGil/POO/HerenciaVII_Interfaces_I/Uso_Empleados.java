package es.DanielGil.POO.HerenciaVII_Interfaces_I;

import java.util.Date;



public class Uso_Empleados {

	public static void main(String[] args) {
		Empleados Alba = new Empleados("Alba",new Date(5465454),2500.00);
		System.out.println(Alba.getNombre());
		
		System.out.println(Alba.getDescripcion());
		
		
		Jefes Daniel = new Jefes("Daniel", new Date(5465454), 3000);
		System.out.println(Daniel.getNombre());
		Daniel.setCargo("Jefe de Operaciones Especiales");
		System.out.println(Daniel.getDescripcion() + Daniel.getCargo());

}
}
