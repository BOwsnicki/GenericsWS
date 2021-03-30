package arrayLists.generic;

import java.util.ArrayList;
import java.util.Scanner;

import types.classes.Pet;

public class Generic {
	public static void main(String[] args) {
		/*
		 * Generic ArrayList: The way to go
		 */
		ArrayList<Pet> pets = new ArrayList<>();
		pets.add(new Pet());
		pets.add(new Scanner(System.in));
		pets.add("car"); 
	}
}
