package es.Daniel_Gil_Ejercicios_POO_III;

import java.util.Random;

import javax.swing.JOptionPane;

public class CuentaCorriente {

	public static void main(String[] args) {
		/*En este ejercicio se trata de crear una clase capaz de crear objetos de tipo “Cuenta Corriente” como si de un banco se tratase. 
		 * La clase tendrá el nombre de “CuentaCorriente” y construirá objetos de tipo cuenta corriente con tres propiedades:

          * Nombre del titular. Este dato será de tipo String
          * Saldo inicial de la cuenta corriente. Este dato será de tipo doublé.
          * Nº de cuenta corriente. Este dato será de tipo Long y lo creará la clase de forma aleatoria durante la ejecución del programa
          
          
         Además, la clase tendrá los correspondientes métodos setters y getters que deberán realizar las siguientes tareas:
         
         · Poder ingresar dinero en una cuenta
         · Poder sacar dinero de una cuenta
         · Devolver el saldo de una cuenta
         · Devolver los datos de una cuenta (titular, saldo y nº de cuenta)
         · Hacer transferencias de dinero entre dos cuentas
		  
		 */
		//Inicialiazar
		int inicializar =Integer.parseInt(JOptionPane.showInputDialog("¿ Desea abir una cuenta bancaria? :\n1.Pulse 1 (SI)\n2.Pulse 2 (NO) :"));
		if(inicializar == 1) {
			String Nombre1 = JOptionPane.showInputDialog("Nombre del Cliente: ");
			double saldo1 = Double.parseDouble(JOptionPane.showInputDialog("Saldo de la cuenta: "));
			Cuenta Cliente1 = new Cuenta(Nombre1, saldo1);
			int inicializar2 =Integer.parseInt(JOptionPane.showInputDialog("¿ Desea realizar alguna operación ? \n1.Pulse 1 (SI) \n2.Pulse 2 (NO)\n3.Salir"));
			if(inicializar2 == 1) {
				Cliente1.setOperaciones_Cuenta();
				JOptionPane.showMessageDialog(null, Cliente1.getDatos_Cliente());
				JOptionPane.showMessageDialog(null, Cliente1.getDinero_Cuenta());
			}else {
				JOptionPane.showMessageDialog(null, "Gracias por su visita");
			}
			
			int inicializar3 =Integer.parseInt(JOptionPane.showInputDialog("¿ Desearealizar una transferencia? :\n1.Pulse 1 (SI)\n2.Pulse 2 (NO) :"));
			if(inicializar3 == 1) {
				String Nombre2 = JOptionPane.showInputDialog("Nombre del Cliente: ");
				double saldo2 = Double.parseDouble(JOptionPane.showInputDialog("Saldo de la cuenta: "));
				Cuenta Cliente2 = new Cuenta(Nombre2, saldo2);
				
				Cuenta.Transferencia(Cliente1, Cliente2);
				JOptionPane.showMessageDialog(null, Cliente1.getDatos_Cliente());
				JOptionPane.showMessageDialog(null, Cliente1.getDinero_Cuenta());
				JOptionPane.showMessageDialog(null, Cliente2.getDatos_Cliente());
				JOptionPane.showMessageDialog(null, Cliente2.getDinero_Cuenta());
				
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Gracias por su visita");
				
			}
			
			
			
			
			
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, " Ha decidido no abrir la cuenta. Gracias de todas formas por su interés");
			//El else Seria como un 2 en la elección
		}
		
		/* Preguntamos si quiere hacer una transferencia. Si el usuario decide realizar una transferencia, lo 1º es crear un objeto Cliente2.
		 * No podemos crear el método setter y getter de la operación, porque al intentar reconocer la varible del segundo objeto nombre no lo reconoce.
		 */
		
			
			
			
		
		

	}

}
class Cuenta{
	
	public Cuenta(String Nombre, double Saldo_Cuenta) {
		this.Nombre=Nombre;
		this.Saldo_Cuenta=Saldo_Cuenta;
		Random rnd = new Random();
		
		this.Numero_cuenta= Math.abs(rnd.nextLong());
	}
	
	
	
	
	public void setOperaciones_Cuenta() {
		int pregunta1 = Integer.parseInt(JOptionPane.showInputDialog("Qué desea realizar\n1.Ingreso\n2.Retirar: "));
		if(pregunta1 == 1) {
			double pregunta2 = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea ingresar: (En decimales, por favor"));
			this.Saldo_Cuenta = Saldo_Cuenta + pregunta2;
		}else if (pregunta1 == 2) {
			double pregunta3 = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar: (En decimales, por favor"));
			this.Saldo_Cuenta = Saldo_Cuenta + pregunta3;
		}else {
			JOptionPane.showMessageDialog(null, "La operación no se puede realizar");
			
		}
		
	}
	
	public static void Transferencia(Cuenta origen, Cuenta destino) {
		double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea ingresar: (En decimales, por favor): "));
		
		origen.Saldo_Cuenta-=cantidad;
		destino.Saldo_Cuenta+=cantidad;
		
	}
	
	
	
	public String getDinero_Cuenta() {
		return "El dinero que actualmente tiene su cuenta es de: " + Saldo_Cuenta;
	}
	
	public String getDatos_Cliente() {
		return " El nombre del cliente es: "+ Nombre + " con un saldo en su cuenta de: " + Saldo_Cuenta + " su número de cuenta es: " + Numero_cuenta;
	}
	
	
	
	
	
	
	
	
	
	
	
	// Propiedades
	private final String Nombre;
	private double Saldo_Cuenta;
	private long Numero_cuenta;
	
}