import java.util.Scanner;
public class Problem4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input x and y:");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int i = 0;
		int product = 1;
		
		while (i < y) {
			product = product * x;
			i++;
		}
		System.out.println(x + " ^ " + y + " = " + product);
	}
}
