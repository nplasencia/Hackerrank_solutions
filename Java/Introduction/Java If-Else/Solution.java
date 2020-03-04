import java.util.Scanner;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String res = "Weird";
		if (N%2!=1) {
			if ((N>1 && N < 6) || N>20) {
				res = "Not Weird";
			}
		}

		System.out.println(res);

		scanner.close();
	}
}