import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i]=scanner.nextInt();
		}
		scanner.close();

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if(sum<0) count++;
			}
		}
		System.out.println(count);
	}

}