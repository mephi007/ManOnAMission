package DynamicProgramming;

import java.lang.*;

public class medianTwoArray {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
		}

		int x = nums1.length;
		int y = nums2.length;
		int low = 0;
		int high = x;
		while (low <= high) {
			int partX = (low + high) / 2;
			int partY = (x + y + 1) / 2 - partX;

			int maxLeftX = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
			int minRightX = (partX == x) ? Integer.MAX_VALUE : nums1[partX];

			int maxLeftY = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
			int minRightY = (partY == y) ? Integer.MAX_VALUE : nums2[partY];

			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
				if ((x + y) % 2 == 0) {
					return ((double) Math.max(maxLeftX, maxLeftY) + (double) Math.min(minRightX, minRightY));
				} else {
					return ((double) Math.max(maxLeftX, maxLeftY));
				}

			}

			else if (maxLeftX > minRightY)
				high = partX - 1;
			else
				low = partX + 1;
		}
		
		throw  new IllegalArgumentException();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 3, 8, 9, 15 };
		int[] nums2 = { 7, 11, 18, 19, 21, 25 };
		double res = findMedianSortedArrays(nums1, nums2);

	}

}
