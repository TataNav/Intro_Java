/*
 * Input an integer n. Print checkerboard pattern with n rows and n columns with the words "black" and "white".
 */

import java.util.Scanner;
public class Problem12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//int n = scanner.nextInt();
		int n = 5;
		int i = 1;
		int j = 1;
		
		String b = "black";
		String w = "white";
		
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
				if(i % 2 > 0) {
					System.out.print(w);
				} else {
					System.out.print(b);
				}
			i++;
			System.out.println();
			j = 1;
		}
	}
}
