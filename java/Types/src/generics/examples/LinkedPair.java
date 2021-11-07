package generics.examples;

public class LinkedPair<T> {
	private Pair<T,LinkedPair<T>> node;
	
	public LinkedPair(T init) {
		node = new Pair<>(init, null);
	}
	
	public void linkTo(T value) {
		node.setR(new LinkedPair<T>(value));
	}
	
	public LinkedPair<T> next() {
		return node.getR();
	}
	
	@Override
	public String toString() {
		String result = node.getL().toString();
		LinkedPair<T> next = node.getR();
		if (next != null) {
			result += " --> " + next.toString(); 
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedPair<Integer> head = new LinkedPair<>(5);
		head.linkTo(4);
		head.next().linkTo(3);
		head.next().next().linkTo(2);
		head.next().next().next().linkTo(1);
		System.out.println(head);
	}
}
