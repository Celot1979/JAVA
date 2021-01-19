package es.Daniel_Gil.Arrays;

public class ARRAY_BIDIMENSONAL_INICIACION_FOREACH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numeros= {
				{-1,-2,-3},
				{2,3,4},
				{5,6,7},
				{8,9,10},
				{11,12,13}};
		
		for(int [] dimension1:numeros) {
			for(int dimension2:dimension1) {
				System.out.print(dimension2 + " ");
			}
			System.out.println();
		}
		

	}
}