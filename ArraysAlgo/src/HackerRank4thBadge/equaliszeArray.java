package HackerRank4thBadge;

import java.util.*;

public class equaliszeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,3,2,1,3};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i])+1;
				map.put(arr[i], count);
			}else map.put(arr[i], 1);
		}
		
		int maxCount = 1;
		int maxEle = -1;
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				maxEle = entry.getKey();
			}
		}
		
		if(maxEle == -1) {
			System.out.println(arr.length-1);
			return;
		}else {
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != maxEle)
					count++;
			}
			System.out.println(count);
			return;
		}
	}

}
