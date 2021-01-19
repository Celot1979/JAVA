package es.Daniel_Gil_Ejercicios_Switch;

import javax.swing.JOptionPane;

public class Switch_uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hijos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos hijos tienes"));
		
		switch (hijos) {
		case 0:
			
			System.out.println("La natalidad es baja");
			break;
			
		case 1:
			System.out.println("Por algo se empieza");
			break;
			
		case 2:
			System.out.println("Tienes la pareja");
			break;
			
		case 3:
			
			System.out.println("Estás empezando a ser un cafre");
			break;
			
		case 4:
			System.out.println("Eres un puto descelebrado");
			break;
			
			
		default:
			
			System.out.println("Sigue así");
		
		
		
		
		}

	}

}
