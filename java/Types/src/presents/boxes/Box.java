package presents.boxes;

public class Box<T> {
	private T item;
	
	public Box() {}
	
	public Box(T item) {
		wrap(item);
	}
	
	public void wrap(T item) {
		this.item = item;
	}
	
	public T unwrap() {
		return item;
	}	
}
