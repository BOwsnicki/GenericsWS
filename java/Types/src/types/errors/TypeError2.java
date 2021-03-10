package types.errors;

class A { A self() { return this; }}

public class TypeError2 {
	public static void main(String[] args) {
		A aInst = new A();
		aInst.self().self();
	}
}
