package HackerRank4thBadge;

import java.util.*;

public class beautifulTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 6, 7, 7, 8, 10, 12, 13, 14, 19 };
		int d = 3;
		Set<Integer> values = new HashSet<>();

		int beautifulTriplets = 0;

		// Build a set
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];

			if (!values.contains(x)) {
				values.add(x);
			}
		}

		// Check if set has a value, value+d, and value + 2d
		for (Integer digit : values) {
			if (values.contains(digit + d) && values.contains(digit + (2 * d))) {
//				beautifulTriplets++;
				int repeat = countRepeat(arr, digit);
				beautifulTriplets += repeat;
				
			}
		}

		System.out.println(beautifulTriplets);
	}

	private static int countRepeat(int[] arr, int digit) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == digit) count++;
		}
		
		return count;
	}

}
