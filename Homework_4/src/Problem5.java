/*Input 2 integers x and y. 
 * Calculate the number and sum of all integer between x and y which are divisible by 9
*/

import java.util.Scanner;
public class Problem5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input two integers:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int i = x;
		int sum = 0;
		boolean flag = true;
		
		while (i <= y) {
			if(i % 9 == 0) {
				if(flag) {
					System.out.println("Numbers between " + x + " and " + y + ", divisible by 9:");
					flag = false;
				}
				sum = sum + i;
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		System.out.println("Sum of these numbers is: " + sum);
	}
}
