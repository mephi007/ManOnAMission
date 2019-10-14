package leetCodeEasy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,5,6};
		
		int index = binarySearch(arr,0, arr.length-1, 0);
		System.out.println(index);

	}

	private static int binarySearch(int[] arr, int beg, int end, int val) {
		// TODO Auto-generated method stub
		if(end>=beg) {
			int mid = beg + (end - beg)/2;
			if(arr[mid] == val)
				return mid;
			if(arr[mid] > val) //val is smaller, recur left side
				return binarySearch(arr, beg, mid-1, val);
			else return binarySearch(arr, mid+1, end, val); // val is greater, recur right side
		}
		return beg;
	}

}
