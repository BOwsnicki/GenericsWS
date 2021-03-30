package types.substitution;
import classes.Cat;
import classes.Dog;
import classes.Pet;

class Super {
	public void foo(Pet[] p) { System.out.println("foo with Pet[]"); };
	public void bar(Cat[] c) { System.out.println("bar with Cat[]"); };
}

class Sub extends Super {

	public void foo(Cat[] p) { System.out.println("foo with Cat[]"); };

	public void bar(Pet[] c) { System.out.println("bar with Pet[]"); };
}

public class Override {
	private static int MAX  = 10;
	
	public static void main(String[] args) {
		Super sup = new Super();
		Sub sub = new Sub();
		Cat[] ca = new Cat[MAX];
		Pet[] pa = new Pet[MAX];

		sup.foo(ca);
		sup.bar(ca);
		sup.foo(ca);
		sup.bar(pa);
		
		sub.foo(ca);
		sub.bar(ca);
		sub.foo(ca);
		sub.bar(pa);
	}
}
