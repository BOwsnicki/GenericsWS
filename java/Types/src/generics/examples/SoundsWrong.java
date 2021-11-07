package generics.examples;

import java.util.ArrayList;
import java.util.List;

public class SoundsWrong<T> {
	private List<T> items = new ArrayList<>(); 
	
	public void add(T elem) {
		items.add(elem);
	}
	
	public void soundAll() {
		for (T elem : items) {
			System.out.println(elem.getSound());
		}
	}
}
