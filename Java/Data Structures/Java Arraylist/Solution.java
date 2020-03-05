import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int numberElementsArray = scanner.nextInt();
			ArrayList<Integer> arrayAux = new ArrayList<Integer>();
			for (int j = 0; j < numberElementsArray; j++) {
				arrayAux.add(scanner.nextInt());
			}
			arrays.add(arrayAux);
		}

		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			try {
				System.out.println(arrays.get(scanner.nextInt()-1).get(scanner.nextInt()-1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		scanner.close();
	}

}