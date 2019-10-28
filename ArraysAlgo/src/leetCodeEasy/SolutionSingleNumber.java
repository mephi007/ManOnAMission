package leetCodeEasy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SolutionSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,2,1,2};
		
	 HashMap<Integer, Integer> hm = new HashMap<>();
	 
	 for(int i: arr) {
		 if(hm.containsKey(i)) {
			 hm.put(i, hm.get(i)+1);
		 }
		 else hm.put(i, 1);
	 }
	 
	 for (Entry<Integer, Integer> e : hm.entrySet()) {
		    if(e.getValue() == 1)
		    	System.out.println(e.getKey());
		}

	}

}
