
public class Uso_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Math.round(9.56789));
		
		/*int resultado = Math.round(3.4F);
		//PAra que un valor deje de etar en float o double
		// se debe poner un F  después del parametro
		System.out.println(resultado);*/
		
		
		/* Se puede convertir el resultado de una función 
		 * en la variable que nos interesa*/
		 
		/* int resultado = (it)Math.round(numero);
		 * En esté caso, sin poner la condición int
		 * antes del método, nos daría error.
		 * Si necesitamos convertir es imprescindible colocar
		 * antes del método a que queremos convertir.*/
		
		double numero = 3.4;
		 
		int resultado = (int)Math.round(numero);
		System.out.println(resultado);
		
		/* Esté ejemplo es idóneo, primero es una vaiable double 
		 * y queremos que nos de un tipo de variable int
		 */
		
		

	}

}
