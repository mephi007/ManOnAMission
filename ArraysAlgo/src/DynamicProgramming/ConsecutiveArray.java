package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,2,1,6,5};
		System.out.println(larSeq(arr));
	

	}

}
