package es.DanielGil.POO.HerenciaVII_Interfaces_II_APi_Java;

import java.util.Arrays;
import java.util.Date;



public class Uso_Empleados {

	public static void main(String[] args) {
		
		
		
        Empleados losEmpleados []= new Empleados[5];
		
		losEmpleados[0]= new Empleados("Juan", new Date(5465454), 2000);
		losEmpleados[1]= new Empleados("María", new Date(5465454), 3000);
		losEmpleados[2]= new Empleados("Ana", new Date(5465454), 1500);
		losEmpleados[3]= new Empleados("Sandra", new Date(5465454), 6000);
		losEmpleados[4]= new Empleados("Antonio", new Date(5465454), 2100);
		
		Arrays.sort(losEmpleados);
		 
		for(Empleados e : losEmpleados) {
			System.out.println(e.getDescripcion());
		}
		
		

	}

}


