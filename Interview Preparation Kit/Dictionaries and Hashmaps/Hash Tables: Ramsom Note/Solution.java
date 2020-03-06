import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		if (magazine.length < note.length) {
			System.out.println("No");
			return;
		}
		HashMap<String, Integer> magazineMap = new HashMap<String, Integer>();

		for (String magWord : magazine) {
			if (magazineMap.containsKey(magWord)) {
				magazineMap.put(magWord, magazineMap.get(magWord)+1);
			} else {
				magazineMap.put(magWord, 1);
			}
		}

		for (String noteWord : note) {
			if (magazineMap.containsKey(noteWord) && magazineMap.get(noteWord)!=0) {
				magazineMap.put(noteWord, magazineMap.get(noteWord)-1);
			} else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}

}