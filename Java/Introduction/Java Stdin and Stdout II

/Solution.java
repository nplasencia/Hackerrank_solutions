import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		Double d = scan.nextDouble();

		// We have to do it because nextInt() and nextDouble() don't take the return. If we don't use it, the scan.nextLine() will take only the return.
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

		scan.close();
	}

}
