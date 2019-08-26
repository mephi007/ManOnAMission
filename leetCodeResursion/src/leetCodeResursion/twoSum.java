package leetCodeResursion;


import java.util.*;
public class twoSum {
	    public static int[] sum(int[] nums, int target) {
	        int[] res = new int[2];
	        Map<Integer, Integer> s = new HashMap<>();
	        for(int i=0; i<nums.length; i++){
	            int temp = target - nums[i];
	            if(s.containsKey(temp)){
	                res[0] = s.get(temp);
	                res[1] = i;
	            }
	            s.put(nums[i], i);
	        }
	        
	       return res; 
	    }
public static void main(String args[]) {
	int[] nums = {3,2,4};
    int[] res = new int[2];
	res = sum(nums, 6);
	for(int i: res)
		System.out.println(i);
	
}
	
	

}
