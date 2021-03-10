
public class Main {
	public static void main(String[] args) {
		final int MAX = 10;
		Integer[] numbers = new Integer[MAX];
		for (int i = 0; i < MAX - 2; i++) {
			numbers[i] = i;
		}
		
		for (int i = 0; i < MAX; i++) {
			if (numbers[i] != null & numbers[i] % 2 == 0) {
				numbers[i]++;
			}
		}
		
		for (int i = 0; i < MAX; i++) {
			System.out.println(numbers[i]);
		}
	}
}
