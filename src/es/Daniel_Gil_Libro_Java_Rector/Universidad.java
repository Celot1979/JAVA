package es.Daniel_Gil_Libro_Java_Rector;

public class Universidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profesor p = new Profesor("Miguel", 2500);
		
		System.out.println( "El profesor se llama:  "+ p.getNombre() + " tiene un sueldo de: " + p.getSueldo() + " €");
		
		
		
		Rector r = new Rector("Pedro", 2500);
		
		r.setIncentivo(2500);
		
		System.out.println( "El Rector se llama:  "+ r.getNombre() +  " " + r.SetSueldo());

	}

}
