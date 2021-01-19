import javax.swing.JOptionPane;

public class Bucle_Dos_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra o frase introduccido\n"
				+ "Para terminar escribe salir");
		
		String texto="";//En este ejemplo con el Do while, al tener que entrar
		// al menos 1 vez en el bucle, ya se inicia la variable texto dentro
		
		do {
			
			texto = JOptionPane.showInputDialog("Introducce el texto");
			
			JOptionPane.showMessageDialog(null,"El texto introduccido tiene " + texto.length() + " caracteres");
	}while(!texto.equals("salir"));
        System.out.println("Has salido del programa");
}
}
