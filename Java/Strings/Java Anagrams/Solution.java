// In this exercise, you can only import the class Scanner. For that, you are not able to use HashMaps.

import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) return false;

		char[] aCharArray = a.toLowerCase().toCharArray();
		b = b.toLowerCase();

		for (char aChar : aCharArray) {
			int pos = b.indexOf(aChar);  
			if (pos >= 0) {
				b = b.substring(0, pos) + b.substring(pos+1); // We delete this character on b
			} else {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}