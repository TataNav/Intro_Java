/*
 * Input an integer n. Print checkerboard pattern with n rows and n columns with the words "black" and "white".
 */
import java.util.Scanner;
public class Problem12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sample input: Input number of rows and columns: ");
		int n = scanner.nextInt();
		int i = 1;
		int j = 1;
		String b = "black";
		String w = "white";
		System.out.println("Sample output:");
		while (i <= n) {
				while (j < n && i % 2 > 0) {
					if (j % 2 > 0) {
						System.out.print(b + "-");
					} else {
						System.out.print(w + "-");
					}
				j++;
			}
				while (j < n && i % 2 == 0) {
					if (j % 2 > 0) {
						System.out.print(w + "-");
					} else {
						System.out.print(b + "-");
					}
				j++;
			}	
				if (i % 2 > 0) {
					if (j % 2 == 0) {
						System.out.print(w);
					} else {
						System.out.print(b);
					}
				} else {
					if (j % 2 == 0) {
						System.out.print(b);
					} else {
						System.out.print(w);
					}
				}
			i++;
			System.out.println();
			j = 1;
		}
	}
}