package arrayLists.generic;

import java.util.ArrayList;
import java.util.Scanner;

import types.classes.Cat;
import types.classes.Dog;
import types.classes.Pet;

public class GenericSubstitution {
	public static void main(String[] args) {
		/*
		 * Generic ArrayList: The way to go
		 */
		ArrayList<Pet> pets = new ArrayList<>();
		pets.add(new Pet());
		pets.add(new Cat());
		pets.add(new Dog());
	}
}
