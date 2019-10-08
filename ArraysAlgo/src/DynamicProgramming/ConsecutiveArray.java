package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConsecutiveArray {
	
	
	public static int larSeq(int[] arr) {
		if(arr.length == 0)
			return 0;
		Arrays.sort(arr);
		 int  count =1;
		 int longest = 1;
		 for(int i =1; i< arr.length ; i++)
		 {
			 if(arr[i] != arr[i-1]) {
				 if(arr[i] == arr[i-1]+1) {
					 count++;
				 }
				 else
				 {
					 longest = Math.max(count, longest);
					 count = 1;
				 }
			 }
			 
		 }
		 
		 return Math.max(longest, count);
	
}
	
	public static int larSeqHash(int[] arr) {
		int max =0;
		HashSet<Integer> values = new HashSet<>();
		for(int i : arr) {
			values.add(i);
		}
		for(int i: values) {
			if(values.contains(i-1)) continue;
			int length =0;
			while(values.contains(i++)) length++;
			max = Math.max(max, length);
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,2,1,6,5};
		System.out.println(larSeq(arr));
		System.out.println("---Optimised using HashSet------");
		System.out.println(larSeqHash(arr));
	

	}

}
