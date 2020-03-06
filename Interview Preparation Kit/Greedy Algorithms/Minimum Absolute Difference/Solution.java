import java.util.Scanner;
import java.util.Arrays;

public class Solution {

	// Complete the minimumAbsoluteDifference function below.
	static int minimumAbsoluteDifference(int[] arr) {
		int res = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			int aux = Math.abs(arr[i]-arr[i+1]);
			if (aux < res) res= aux;

		}
		return res;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int result = minimumAbsoluteDifference(arr);

		System.out.println(String.valueOf(result));

		scanner.close();
	}

}