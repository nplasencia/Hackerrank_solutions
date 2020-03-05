import java.util.*;

//TODO: Improve it. https://www.hackerrank.com/challenges/java-stack/forum

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
			char[] characters = input.toCharArray();
			ArrayList<Character> analyzing = new ArrayList<Character>();

			boolean correct = true;
			for (char character : characters) {
				if (analyzing.size() == 0 && (character == ']' || character == ')' || character == '}')) {
					correct = false;
					break;
				} else if (character == '[' || character == '(' || character == '{') {
					analyzing.add(character);
				} else if (character == ']' || character == ')' || character == '}') {
					switch (character) {
					case ']':
						if (analyzing.get(analyzing.size()-1) != '[') {
							correct = false;
						} else {
							analyzing.remove(analyzing.size()-1);
						}
						break;

					case ')':
						if (analyzing.get(analyzing.size()-1) != '(') {
							correct = false;
						} else {
							analyzing.remove(analyzing.size()-1);
						}
						break;

					case '}':
						if (analyzing.get(analyzing.size()-1) != '{') {
							correct = false;
						} else {
							analyzing.remove(analyzing.size()-1);
						}
						break;

					default:
						break;
					}
					if (!correct) {
						break;
					}
				}
			}
			if (analyzing.size() > 0) {
				correct = false;
			}
			System.out.println(correct);
		}
		sc.close();
	}
}