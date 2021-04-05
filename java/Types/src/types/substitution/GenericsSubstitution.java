package types.substitution;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import types.classes.Cat;
import types.classes.Pet;

public class GenericsSubstitution {
	public static void main(String[] args) {
		AbstractList<Pet> ap = new ArrayList<>();
		List<Pet> lp = new ArrayList<>();
		List<Cat> lc = new ArrayList<Cat>();
		lp = lc; // no subtyping with type parameters!
	}
}
