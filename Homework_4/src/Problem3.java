//Input an integer. Print multiplication table of that integer up to 10.
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an integer");
		int multiplicand = scanner.nextInt();
		int multiplier = 1;
		int product;
		
		while (multiplier < 11) {
			product = multiplicand * multiplier;
			System.out.println(multiplicand + " * " + multiplier + " = " + product);
			multiplier++;
		}
	}
}
