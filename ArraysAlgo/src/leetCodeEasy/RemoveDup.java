package leetCodeEasy;

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
int len =0;
		
		for(int j=1; j<nums.length; j++) {
			if(nums[j] == nums[len])
				continue;
			else {
                len++;
                nums[len] = nums[j];
            }
		}

		
		System.out.println(len);
	}

}
