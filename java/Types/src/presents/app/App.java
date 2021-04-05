package presents.app;

import java.util.List;

import presents.boxes.Box;
import presents.boxes.Presents;
import presents.present.Guitar;
import presents.present.Hammer;
import presents.present.Present;
import presents.present.Sweatshirt;

public class App {
	public static void main(String[] args) {
		Presents list = new Presents();
		
		System.out.println("Wrapping a guitar");
		list.addBox(new Box<Present>(new Guitar()));
		
		System.out.println("Wrapping a hammer");
		list.addBox(new Box<Present>(new Hammer()));
		
		System.out.println("Wrapping a sweatshirt");
		list.addBox(new Box<Present>(new Sweatshirt()));
		
		// Now see what's stored
		List<Box<Present>> boxes = list.getPresents();
		
		for (Box<Present> box : boxes) {
			Present p = box.unwrap();
			System.out.println(p);
		}
		
	}
}
