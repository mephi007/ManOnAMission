package HackerRank4thBadge;
/*In any magic square, the first number i.e. 1 is stored at position (n/2, n-1). 
 * Let this position be (i,j). The next number is stored at position (i-1, j+1) 
 * where we can consider each row & column as circular array i.e. they wrap around.
 * 
 * 
 * 1. The position of next number is calculated by decrementing row number of previous number by 1, 
 * and incrementing the column number of previous number by 1. At any time, 
 * if the calculated row position becomes -1, it will wrap around to n-1. 
 * Similarly, if the calculated column position becomes n, it will wrap around to 0.

2. If the magic square already contains a number at the calculated position, 
calculated column position will be decremented by 2, and calculated row position will be incremented by 1.

3. If the calculated row position is -1 & calculated column position is n, 
the new position would be: (0, n-2). 
 */

public class MagicSquare {

	private static void magicSquare(int n, int[][] sq) {
		// TODO Auto-generated method stub

		int j = n - 1;
		int i = n / 2;

		for (int num = 1; num <= n * n;) {
			if (i == -1 && j == n) {
				i = 0;
				j = n - 2;
			} else {

				if (j == n)
					j = 0;
				if (i < 0)
					i = n - 1;

			}
			if(sq[i][j] != 0) {
				i++;
				j -= 2;
				continue;
			}
			else {
			sq[i][j] = num++;
			}
			i--;
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;

		int[][] sq = new int[n][n];
		magicSquare(n, sq);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(sq[i][j] + " ");
			}
			System.out.println();
		}

	}
}
