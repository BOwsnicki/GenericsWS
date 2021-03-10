
public class Sums {
	public static void main(String[] args) {
		int n = 1;
		int sum = n; // or 1, your choice
		
		for (int i = 1; i <= 10; i++) {
			n *= 2;
			sum += n;
			System.out.println("Sum = " + sum + " after adding " + n);
		}
	}
}
