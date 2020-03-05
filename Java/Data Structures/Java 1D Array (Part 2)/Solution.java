import java.util.*;

public class Java1DArrayPartII {

	public static boolean canWin(int leap, int[] game) {
		// Return true if you can win the game; otherwise, return false.
		if (leap >= game.length) return true;

		return canIMove(leap, game, 0);
	}

	private static boolean canIMove(int leap, int[] game, int position) {
		if (position > game.length-1) return true;
		if (position < 0 || game[position] == 1) return false;

		game[position] = 1;
		return canIMove(leap, game, position+1) || canIMove(leap, game, position-1) || canIMove(leap, game, position+leap); 
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
		}
		scan.close();
	}

}