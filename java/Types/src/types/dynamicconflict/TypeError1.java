package types.dynamicconflict;

import classes.Cat;
import classes.Dog;
import classes.Pet;

public class TypeError1 {
	private static int MAX  = 10;
	
	public static void main(String[] args) {
		Cat[] ca = new Cat[MAX];
		Pet[] pa = ca;
		pa[0] = new Dog();
	}
}
