package types.dynamicconflict;

import types.classes.Cat;
import types.classes.Dog;
import types.classes.Pet;

public class TypeError1 {
	private static int MAX  = 10;
	
	public static void main(String[] args) {
		Cat[] ca = new Cat[MAX];
		Pet[] pa = ca;
		pa[0] = new Dog();
	}
}
