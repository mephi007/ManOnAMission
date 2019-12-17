package HackerRank4thBadge;

public class ClimbingLeaderBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {100,100,50,40,40,20,10};
		int[] alice = {5,25,50,120};
		
		int[] res = new int[alice.length];
		int[] rank = new int[scores.length];
		
		rank[0] = 1;
		
		for(int i=1; i<scores.length; i++) {
			if(scores[i-1] == scores[i])
				rank[i] = rank[i-1];
			else rank[i] = rank[i-1]+1;
		}
		
		for(int i=0; i<alice.length; i++) {
			if(alice[i] >= scores[0])
				res[i] = 1;
			else if(alice[i] < scores[scores.length-1]) {
				res[i] = rank[rank.length-1]+1;
			}
			else {
				int index = binarySearch(scores, alice[i]);
				res[i] = rank[index];
			}
		}
		
		for(int i:res) {
			System.out.println(i);
		}
	}

	private static int binarySearch(int[] a, int key) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = a.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (a[mid] < key && key < a[mid - 1]) {
				return mid;
			} else if (a[mid] > key && key >= a[mid + 1]) {
				return mid + 1;
			} else if (a[mid] < key) {
				hi = mid - 1;
			} else if (a[mid] > key) {
				lo = mid + 1;
			}
		}
		return -1;
	}

}
