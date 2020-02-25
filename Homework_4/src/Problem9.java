//Input an integer. Calculate factorial.
import java.util.Scanner;
public class Problem9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sample input: ");
		int n = scanner.nextInt();
		int i = 1;
		int product = 1;
		while (i <= n) {
			product = product * i;
			i++;
		}
		System.out.println("Sample output: " + product);
	}
}