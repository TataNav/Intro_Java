/* 
 * Solve problem 7, but this time output full expression.
 */
import java.util.Scanner;
public class Problem8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sample input:");
		//int n = scanner.nextInt();
		int n = 5;
		int i = 1;
		int j = 0;
		int portion = 0;
		int sum = 0;
		
		while (i < n) {
			j = i + 1;
			portion = i - j;
			sum = sum + portion;
			i += 2; 	
			System.out.print(i + " - " + j);
		}
		if (n % 2 == 1 ) 
			sum = sum + n;
		System.out.println();
		System.out.println("Sample input: " + sum);
	}
}