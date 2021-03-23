package es.Daniel_Gil_Ejercicios_Internet_Casting;

import java.util.Random;

import javax.swing.JOptionPane;


public class Interno {
	public Interno(int l, int n) {
		longitud = l;
		num_password = n;}

public String getLongitud () {
	return "La longitud solicitada será de: " + longitud + " caracteres";}

public String getNum_Pass () {
	return ".La cantidad de contraseñas serán: " + num_password + " contraseñas"; }

public String generarPassword() {
	final char[] caracteres = {'z','x','c','v','b','n','m','a','s','d','f','g',
'h','j','k','l','ñ','q','w','e','r','t','y','u','i','o','p',
 'Z','X','C','V','B','N','M','A','S','D','F','G',
'H','J','K','L','Ñ','Q','W','E','R','T','Y','U','I','O','P','1','2'
 ,'3','4','5','6','7','8','9','0','!','#','$','%','&','/','*','¨',
'+','?'};
     String temporal= " ";

     Random aleatorio= new Random();

     for (int i = 0 ; i < longitud;i++ ) {
    	 temporal += caracteres[aleatorio.nextInt(caracteres.length)];}
     
     int num = 0;
     //String mayu ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
     //String min ="abcdefghijklmnopqrstuwxyz"; 
     int minus = 0;
     int mayus = 0;
     
     for (int j = 0; j < longitud; j++) {
    	 
    	 if(Character.isDigit(temporal.charAt(j)) == true) {
    		 num ++;
 
    	 }else  if(Character.isDigit(temporal.charAt(j)) == false){
    		continue;
    		 
    	 }
    		 
    	 
     }
     
     
     for ( int r = 0; r < longitud; r++) {
    	 if (Character.isUpperCase(temporal.charAt(r))) mayus++;
     }
     
     //System.out.println("Hay " + mayus + " mayusculas");
     
     for( int m = 0; m < longitud; m++) {
    	 if (Character.isLowerCase(temporal.charAt(m))) minus++;
    	 
     }
     //System.out.println("Hay " + minus + " minusculas");
     
    
     
     
     if(num >=5 ) {
    	 if(mayus > 2) {
    		 if(minus > 1) {
    			 System.out.println("CONTRASEÑA SEGURA");
    		 }else {
    			 System.out.println("NO Segura. Faltan manúsculas"); 
    			 
    		 }
    		 
    	 }else {
    		 System.out.println("NO Segura. Faltan mayúsculas"); 
    	 }
 
     }else {
    	 System.out.println("NO Segura. No tiene 5 números.");
     }
     
     
     // habria que hacer tres for  para cada una... numeros mayusculas minusculas y despues un if para ver que se cuumplen
    /* int num = 0;
     
     while (num == 5) {
    	 for (int j = 0; j < longitud; j++) {
        	 if(Character.isDigit(temporal.charAt(j)))
        		 System.out.println("No hay numeros");
        	 num++;
        	 else
        		 if (Character.isDigit(temporal.charAt(j))) {
        			 
        		 }
        		 
        	 } 
    	 
     }*/
  
     return temporal; 
     }






public void setTotal() {
	int t = 0;

    while (t < num_password ) {
    	String c = generarPassword();
    	t++;
    	System.out.println(c);
    	}
}




//Propiedades
private int longitud;
private int num_password;
private String control;
private int arreglo[];
private String c;

}

