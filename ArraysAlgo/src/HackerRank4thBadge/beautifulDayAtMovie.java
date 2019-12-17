package HackerRank4thBadge;

public class beautifulDayAtMovie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20, j = 23, k = 6;
		int count = 0;
		if (isBeautiful(Math.abs(palindrome(i) - i), k)) {
			count++;
		}
		if (isBeautiful(Math.abs(palindrome(j) - j), k)) {
			count++;
		}
		System.out.println(count);
	}

	static int palindrome(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	static boolean isBeautiful(int num, int divisor) {
		if (num % divisor == 0)
			return true;

		return false;
	}

}
