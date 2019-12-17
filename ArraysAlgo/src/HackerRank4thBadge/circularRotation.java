package HackerRank4thBadge;

public class circularRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {3,4,5};
		
		for(int j =0; j< 2; j++) {
		int temp = ar[ar.length-1];
		
		for(int i=ar.length-1; i>0; i--) {
			ar[i] = ar[i-1];
		}
		ar[0] = temp;
		}
		
		for(int i:ar) System.out.println(i);
	}

}
