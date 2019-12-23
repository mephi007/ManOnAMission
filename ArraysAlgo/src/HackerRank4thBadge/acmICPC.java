package HackerRank4thBadge;

import java.util.*;


public class acmICPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10101
11100
11010
00101
		 */
		String[] topic = { "10101", "11100", "11010", "00101" };
		int maxTopic = 0;
		int countTopic;
		int res[] = new int[2];
		
		List<Integer> topicCount = new ArrayList<>();
		
		for(int i=0; i<topic.length; i++) {
			String ith = topic[i];
			for(int j= i+1; j<topic.length; j++) {

				int k=0;
				countTopic =0;
				String jth = topic[j];
				while(k < topic[0].length()) {
					int a =Integer.parseInt(ith.substring(k,k+1));
					int b = Integer.parseInt(jth.substring(k,k+1));
					int knownTopic = a|b; 
					if(knownTopic == 1) countTopic++;
					
					k++;
				}
				
				maxTopic = Math.max(maxTopic, countTopic);
				topicCount.add(countTopic);
			}
			
			
		}
		
		res[0] = maxTopic;
		res[1] = 0;
		for(int i:topicCount) {
			if(i==maxTopic)
				res[1] = res[1]+1;
		}
			
		
		for(int i:res)
			System.out.println(i);
	}

}
