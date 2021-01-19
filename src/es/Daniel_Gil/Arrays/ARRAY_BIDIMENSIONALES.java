package es.Daniel_Gil.Arrays;

public class ARRAY_BIDIMENSIONALES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] numeros = new int [5] [3];
		
		numeros [0] [0] =-1;
		numeros [0] [1] =-2;
		numeros [0] [2] =-3;
		
		numeros [1] [0] =2;
		numeros [1] [1] =3;
		numeros [1] [2] =4;
		
		numeros [2] [0] =5;
		numeros [2] [1] =6;
		numeros [2] [2] =7;
		
		numeros [3] [0] =8;
		numeros [3] [1] =9;
		numeros [3] [2] =10;
		
		numeros [4] [0] =11;
		numeros [4] [1] =12;
		numeros [4] [2] =13;
		
		//System.out.println(numeros[2] [1]);
		
		for (int i =0; i < 5; i ++) {
			
			for (int z = 0; z < 3; z ++) {
				System.out.println(numeros[i][z]);
			}
		}
		
		

	}

}
