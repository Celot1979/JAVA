package es.Daniel_Gil_Operador_ternario;

import javax.swing.JOptionPane;

public class Operador_Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*double salariot1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce 1º salario"));
		double salariot2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce 2º salario"));
        double salario_mayor;
        
        if(salariot1>salariot2) salario_mayor = salariot1;
        else salario_mayor=salariot2;
        
        salario_mayor =(salariot1 > salariot2 )? salariot1:salariot2;
        System.out.println("El salario mayor es " + salario_mayor);*/
		
		
		//--------------------------------------------------------------
		
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		
		String mayor = (edad>18)? "Eres mayor de edad":"Eres menor de edad";
		System.out.println(mayor);
				
	}

}
