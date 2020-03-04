import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();

		for(int i=0;i<t;i++){	
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			int aux = a;

			for (int j = 0; j < n; j++) {
				aux = aux + (int)Math.pow(2, j)*b;
				System.out.printf("%d ", aux);
			}
			System.out.println();
		}

		in.close();
	}

}
