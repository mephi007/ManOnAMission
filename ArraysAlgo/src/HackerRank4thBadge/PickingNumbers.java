package HackerRank4thBadge;

import java.util.*;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {4,6,5,3,3,1};
		
		int[] freq = new int[101];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<ar.length; i++)
			freq[ar[i]]++;
		
		for(int i=1; i<=100; i++)
			max = Math.max(max, freq[i-1]+freq[i]);
		
		System.out.println(max);
	}

}
