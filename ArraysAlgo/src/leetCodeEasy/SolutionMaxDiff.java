package leetCodeEasy;

public class SolutionMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		int min = Integer.MAX_VALUE;
		 int maxDiff = 0;
	        
	        for(int i=0; i<arr.length; i++){
	            if(arr[i] < min)
	                min = arr[i];
	            else{
//	                if(arr[i] - min > maxDiff)
	                    maxDiff += arr[i] - min;
	                    min = Integer.MAX_VALUE;
	            }
	        }
	        System.out.println(maxDiff);
	}

}
