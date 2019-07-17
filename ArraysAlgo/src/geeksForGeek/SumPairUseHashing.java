package ArrayMission;

import java.util.HashSet;

public class SumPairUseHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a =  {11, 15, 26, 38, 9, 10}; 
		int n = a.length;
		int sum = 45;
		
		boolean flag = false;
		HashSet<Integer> s = new HashSet<>();
		for(int i=0; i<n; i++)
		{
			int temp = sum - a[i];
			if(s.contains(temp))
			{
				flag = true;
				System.out.println("sum pair are :"+a[i]+" and "+temp);
			}
			
			s.add(a[i]);
		}
		if(flag == false)
			System.out.println("no pair");

	}

}
