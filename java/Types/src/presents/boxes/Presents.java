package presents.boxes;

import java.util.ArrayList;
import java.util.List;

import presents.present.Present;

public class Presents {
	private List<Box<Present>> presents;
	
	public Presents() {
		presents = new ArrayList<>();
	}
	
	public void addBox(Box<Present> b) {
		presents.add(b);
	}
	
	public List<Box<Present>> getPresents() {
		List<Box<Present>> result = new ArrayList<>();
		for (Box<Present> box : presents) {
			result.add(box);
		}
		return result;
	}
}
