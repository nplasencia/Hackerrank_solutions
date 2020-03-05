import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalRegisters = sc.nextInt();
		sc.nextLine();
		HashMap<String, String> phoneBook = new HashMap<String, String>();
		for (int i = 0; i < totalRegisters; i++) {
			phoneBook.put(sc.nextLine(), sc.nextLine());
		}

		while (sc.hasNext()) {
			String key = sc.nextLine();
			if (phoneBook.containsKey(key)) {
				System.out.println(key + "=" + phoneBook.get(key));
			} else {
				System.out.println("Not found");
			}
		}

		sc.close();
	}
}