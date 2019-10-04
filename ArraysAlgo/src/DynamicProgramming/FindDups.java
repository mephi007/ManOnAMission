package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,2,1};
		List<Integer> result = findDup(arr);
		for(int i: result)
			System.out.println(i);

	}
	
	public static List<Integer> findDup(int[] arr){
		Set<Integer> res = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			
			int index = Math.abs(arr[i])-1;
			if(arr[index] < 0) {
				res.add(arr[i]);
			}
			else arr[index] = -arr[index];
		}
		
		for(int i=0; i<arr.length; i++)
			arr[i] = Math.abs(arr[i]);
		
		return new ArrayList(res);
	}
}
