/* Problem 7
 * Input an integer n. Calculate the result of the following formula:
1 - 2 + 3 - 4 + 5 - 6 + 7 .... (+or-) n
 */
import java.util.Scanner;
public class Problem7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sample input:");
		int n = scanner.nextInt();
		int i = 1;
		int portion = 0;
		int sum = 0;
		while (i < n) {
			portion = i -(i + 1);
			sum = sum + portion;
			i += 2; 			
		}	
		if (n % 2 == 1 ) 
			sum = sum + n;
		System.out.println("Sample input: " + sum);
	}
}