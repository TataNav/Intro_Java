//Input an integer n. Calculate n-th fibonacci number.
import java.util.Scanner;
public class Problem10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sample input: ");
		int n = scanner.nextInt();
		int fib_num0 = 0;
		int fib_num1 = 1;
		int current_fib_num = 0;
		int i = 3;
		while (i <= n) {
			current_fib_num = fib_num0 + fib_num1;
			fib_num0 = fib_num1;
			fib_num1 = current_fib_num;
			i++;
		}
		System.out.println("Sample output: " + current_fib_num);
	}
}