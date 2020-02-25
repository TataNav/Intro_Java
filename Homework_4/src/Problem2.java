//Calculate the sum of the first 20 natural numbers.
public class Problem2 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while (i <= 20) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}
}
