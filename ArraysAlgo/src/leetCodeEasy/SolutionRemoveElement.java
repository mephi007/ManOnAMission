package leetCodeEasy;

public class SolutionRemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3,2,2,3};
		int val = 3;
		
		int i=0;
		for(int j=0; j<nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		System.out.println(i);
	}

}
