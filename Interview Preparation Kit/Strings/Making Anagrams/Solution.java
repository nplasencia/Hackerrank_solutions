import java.util.Scanner;

public class Solution {

	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {
		int res = 0;
		
		for (int i = 0; i < a.length(); i++) {
			int pos = b.indexOf(a.charAt(i)); 
			if (pos >= 0) {
				b = b.substring(0, pos) + b.substring(pos+1);
			} else {
				res++;
			}
		}
		
		return res+b.length();
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        System.out.println(String.valueOf(res));

        scanner.close();
    }
}