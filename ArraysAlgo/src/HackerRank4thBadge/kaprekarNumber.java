package HackerRank4thBadge;

public class kaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 400, q = 700;
		
		boolean noKarpekar = false;
		for (long i = p; i <= q; i++) {
			if (isKaprekar(i)) {
				System.out.print(i + " ");
				noKarpekar = true;
			}
			if (i == q && noKarpekar )
				System.out.println();
		}
		
		if(!noKarpekar) System.out.println("Invalid range");

	}

	public static boolean isKaprekar(long n) {

		String sqNum = Long.toString(n * n);

		String num = Long.toString(n);

//		if(sqNum.length() != 2*num.length() || sqNum.length() != 2*num.length()-1)
//				return false;
		int leftLength = sqNum.length() - num.length();

		String right = sqNum.substring(leftLength, sqNum.length()).length() == 0 ? "0"
				: sqNum.substring(leftLength, sqNum.length());
		String left = sqNum.substring(0, leftLength).length() == 0 ? "0" : sqNum.substring(0, leftLength);

		long kapNum = Long.valueOf(left) + Long.valueOf(right);

		if (kapNum == n)
			return true;
		else
			return false;
	}

}
