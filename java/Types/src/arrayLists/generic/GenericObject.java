package arrayLists.generic;

import java.util.ArrayList;
import java.util.Scanner;

import types.classes.Pet;

public class GenericObject {
	public static void main(String[] args) {
		/*
		 * Raw ArrayList: In general discouraged
		 */
		ArrayList<Object> pets = new ArrayList<>();
		pets.add(new Pet()); 
		pets.add(new Scanner(System.in));
		pets.add("car"); 		
	}
}
