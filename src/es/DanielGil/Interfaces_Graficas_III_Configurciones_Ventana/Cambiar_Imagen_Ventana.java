package es.DanielGil.Interfaces_Graficas_III_Configurciones_Ventana;
import java.awt.*;

import javax.swing.*;
public class Cambiar_Imagen_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miJFrame miventana = new miJFrame();
	
	}

}
class miJFrame extends JFrame{
	public miJFrame() {
		setSize(600,350);
		setTitle("Ventana de prueba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(600, 350);
		/* Lo 1º que debemos de tener es una imagen en la carpeta raíz del proyecto
		 * 2º Crear un objeto de la clase Toolkit. Ligado al método getDefaultTollkit.
		 * Que será el responsable de almacenar todos los datos que pueda devolver el 
		 * hardware.
		 * 3º Crearemos otro objeto de la clase Image. El cual guardará el objeto anteriormente
		 * creado y además usará el método getImage que nos devolverá la imagen que tenemos guardada 
		 * en la raíz.
		 * 4º Por último, y para que toda la operación sea realizada con éxito, crearemos un objeto 
		 * de la calse JFRame ( que al estar en un constructor de la misma clase, no se 
		 * crea un objeto- , simplemente se usa el método setIconoImage(objeto de la clase
		 * Image).
		 */
		Toolkit miSistema = Toolkit.getDefaultToolkit();
		Image miIcono = miSistema.getImage("icono.PNG");
		setIconImage(miIcono);
		setVisible(true);
	}
}