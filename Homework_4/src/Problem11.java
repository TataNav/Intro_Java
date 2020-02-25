/*
 * Input an integer n. Check if n is a prime number.
 */
import java.util.Scanner;
public class Problem11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int i = 2;
		boolean prime = true;
		
		while (i < n) {
			if (n % i == 0) {
				System.out.println("This is not a prime number: " + n);
				prime = false;
				break;
				
			} else if (prime) {
				System.out.println("This is a prime number: " + n);
				break;
			}
			i++;
		}
	}
}
