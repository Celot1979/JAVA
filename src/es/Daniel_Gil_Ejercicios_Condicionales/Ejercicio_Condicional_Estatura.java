package es.Daniel_Gil_Ejercicios_Condicionales;
import javax.swing.JOptionPane;

public class Ejercicio_Condicional_Estatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero = JOptionPane.showInputDialog("Eres hombre o mujer");
		
		int peso_ideal;
		
		
		if (genero.equals("Hombre")) {
			int estatura = Integer.parseInt(JOptionPane.showInputDialog("Indique su estatura, por favor"));
		
			 peso_ideal = estatura - 120;
			
			JOptionPane.showMessageDialog(null, "Tu peso ideal es " + peso_ideal + " kg");
			
		}else {
			int estatura = Integer.parseInt(JOptionPane.showInputDialog("Indique su estatura, por favor"));
			int peso_ideal_dos = estatura - 110;
			JOptionPane.showMessageDialog(null, "Tu peso ideal es " + peso_ideal_dos+ " kg");
			
			
		}

	}

}
