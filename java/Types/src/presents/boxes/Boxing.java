package presents.boxes;

import presents.present.Guitar;
import presents.present.Present;

public class Boxing {
	public static void main(String[] args) {
		Present p1 = new Guitar();
		Box<Present> box = new Box<>();
		box.wrap(p1);
		Present p2 = box.unwrap();
		System.out.println(p2);
	}
}
