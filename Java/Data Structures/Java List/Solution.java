import java.util.Scanner;
import java.util.ArrayList;

public class JavaList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			array.add(sc.nextInt());
		}

		int queriesNumber = sc.nextInt();
		for (int i = 0; i < queriesNumber; i++) {
			switch (sc.next()) {
			case "Insert":
				array.add(sc.nextInt(), sc.nextInt());
				break;

			case "Delete":
				array.remove(sc.nextInt());
				break;

			default:
				break;
			}
		}

		sc.close();

		for (int item : array) {
			System.out.print(item + " ");
		}
	}

}