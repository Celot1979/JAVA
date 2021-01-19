package es.DanielGil.Bucle_For;

public class Bucle_For_Dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Para salir de un for o While se usa break.
		// Se podría hacer de la siguiente manera
		
		/*for(int i = 0;i<10;i++) {
			System.out.println("hola alumnos");
			if (i==3) break;
			//Suponiendo que queramos que pare el bucle en la 4ª vuelta
			// tendremos que poner un condicional con hasta uno menos. Así,
			// se imprimirá 4 veces el resultado que queremos.
			
		}
		System.out.println("Ha salido fuera del bucle");	*/
		
		
		
		// SEGUNDO EJEMPLO EN BUCLE FOR
		
		for(int i= 0; i<10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.println(("Hola alumnos"));
				
			}
		}
		System.out.println("Ha salido fuera del bucle");

	}

}
