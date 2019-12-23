package HackerRank4thBadge;
import java.util.*;

public class cutTheSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 4 4 2 2 8
		//1 2 3 4 3 3 2 1
		int[] arr = {5,4,4,2,2,8};
		
		List<Integer> res = new ArrayList<>();
		
		int j = arr.length;
		
		while(j != 0) {
			res.add(j);
			
			//find min
			int min = Integer.MAX_VALUE;
			for(int i=0; i<j; i++) {
				if(arr[i] < min)
					min = arr[i];
			}
			for(int i=0; i<j; i++)
				arr[i] = arr[i]-min;
			
			//operation cutting shortest;
			int k = 0;
			for(int i=0; i<j; i++) {
				if(arr[i] >0) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
					k++;
				}
			}
			j = k;
			
		}

		int[] re = new int[res.size()];
		for(int i=0; i<res.size(); i++)
			re[i] = res.get(i);
		
		for(int i:re)
			System.out.println(i);

	}

}
