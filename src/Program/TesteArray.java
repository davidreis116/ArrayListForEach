package Program;

import java.util.Random;

public class TesteArray {

	public static void main(String[] args) {
		
		int a = 10;
		
		
		String vect [] = new String [a];
		String[] myStringArray = new String[] {"david", "reis"};		
		int[] myIntArray = new int[a];
		
		Random gerador = new Random(10); //CLASS RADOM IN ORDER TO CREATE RANDOM NUMBER
		
	
		
		System.out.println();
		for (int i = 0; i<a; i++) {
			System.out.println("");
			
			System.out.println(vect[i]);
			myIntArray[i] = i; 
			System.out.println(myIntArray[i]);
		}
	
		
		for (int i = 0; i<myStringArray.length; i++) {
			System.out.println("");
			System.out.println(myStringArray[i]);
		}
		
		for (String foreach :myStringArray ) {// FOR EACH, IT RUNS FOR ALL THE ELEMENTS FROM THE ARRAY
			System.out.println(foreach);
		}
	
		for (int i = 0; i<6; i++) {
			System.out.println(gerador.nextInt(60));
			
		}
		
		
		
		
		
		
	
	
		

	}

}
