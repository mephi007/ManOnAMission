package leetCodeEasy;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2};
		if(arr.length == 1) {
			System.out.println(arr[0]);
			return;
		}
		int max =arr[0];
		int cur =arr[0];
		for(int i=1; i<arr.length; i++) {
			cur = Math.max(cur+arr[i], arr[i]);
			max = Math.max(max, cur);
		}
		
		System.out.println(Math.max(max, cur));

	}

}
