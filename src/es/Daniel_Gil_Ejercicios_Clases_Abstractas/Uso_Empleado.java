package es.Daniel_Gil_Ejercicios_Clases_Abstractas;

public class Uso_Empleado {

	public static void main(String[] args) {
		EmpleadoAsalariado ar = new EmpleadoAsalariado("Antonio ", " López ", " 6546546Z", 2014);
		//ar.setNombre("MAnuel");;
		//System.out.println(ar.getNombre());
		//System.out.println(ar.getApellido());
		//System.out.println(ar.getDNI());
		//System.out.println(ar.getFecha());
		
		//System.out.println(ar.getSalario());
		
		System.out.println("############################################################################");
		
		
		EmpleadoComision RPT = new EmpleadoComision ("Sandra","Nieto","7879879S",  2011,169, 7.1);
		
		System.out.println(RPT.getNombre());
		System.out.println(RPT.getApellido());
		System.out.println(RPT.getDNI());
		System.out.println(RPT.getFecha());
		System.out.println(RPT.getClientes());
		System.out.println(RPT.getComision());
		//System.out.println(RPT.getSalario());
		System.out.println(RPT.CalculoSalario());
		
		
		
		// !!!!!!!! Tenemos que solucionar esto y luego hacer los métodos de mayor sueldo y mostrar todos
		
		/*EmpleadoComision  ejemplo3 = new EmpleadoComision();
		ejemplo3.setNombre("Manuel");
		ejemplo3.setApellido("Ruíz");
		ejemplo3.setDni("4654654D");
		ejemplo3.setFecha(2010);
		ejemplo3.setClientes(39);
		ejemplo3.setComision(6.90);*/
		EmpleadoAsalariado Maria = new EmpleadoAsalariado("Maria ", " Ramos ", "77879878F", 2011);
		EmpleadoComision Manuel = new EmpleadoComision ("Manuel","Ruíz","4654654D",  2010,35, 6.9);
		
		
		Empleado [] trabajos = new Empleado[4];
		trabajos[0]= ar;
		trabajos[1]= RPT;
		trabajos[2]=Manuel;
		trabajos[3]=Maria;
		
		System.out.println(Manuel.CalculoSalario());
	
	
	for(Empleado b : trabajos) {
		
		System.out.println(b.getSalario());

	}
	mostrartodos(trabajos);
	
		
	}
	//Has aquí el main
	
	//Mostrar Todos
	public static void mostrartodos(Empleado trabajos[]) {
		for (int i = 0; i < trabajos.length; i++) {
			System.out.println(trabajos[i].Imprimir());
		}
	
	}
	
	
	// Sueldo Mayor
	
	
	
}
	
	
		

	
	
	
	
	
	



