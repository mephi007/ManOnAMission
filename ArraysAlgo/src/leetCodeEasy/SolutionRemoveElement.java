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
		
		int[] arr = {0,1,2,2,3,0,4,2};
		System.out.println("--------better approach-----");
		int k = 0;
		int value = 2;
		int n = arr.length;
		while(k<n) {
			if(arr[i] == value) {
				arr[i] = arr[n-1];
				n--;
			}
			else { k++; }
		}
		System.out.println(n);
	}

}
