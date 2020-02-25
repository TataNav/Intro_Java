/*
 *  Input an integer n. Find the following sum: 1 + ½ + ⅓ +¼ + … 1/n
 */
import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sample input:");
		int n = scanner.nextInt();
		double i = 1;
		double sum = 0;
		while (i <= n) {
			sum = sum + 1/i;
			i++;
		}
		System.out.println("Sample output:");
		System.out.println(sum);
	}
}