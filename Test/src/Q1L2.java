
public class Q1L2 {
	public static void main (String [] args) {
		int i, sum = 0;
		
		for (i = 1; i <= 50000; i++) {
			if (i < 100 || i > 137) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}
}
