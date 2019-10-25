package leetCodeEasy;

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		System.out.println(pascalTrianle(n));

	}

	private static List<List<Integer>> pascalTrianle(int n) {
		// TODO Auto-generated method stub
		List<List<Integer>> res= new ArrayList<>();
		helper(res,n);
		return res;
	}

	private static void helper(List<List<Integer>> res, int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++) {
			List<Integer> arr = new ArrayList<>();
			for(int j =0; j<=i; j++) {
				if(j==0 || i==0 || i==j)
					arr.add(1);
				else {
//					int value = fact(i)/ (fact(j)*fact(i-j));
					int value = res.get(i-1).get(j-1) + res.get(i-1).get(j); 
					arr.add(value);
				}
			}
			res.add(arr);
		}
		
	}

//	private static int fact(int i) {
//		// TODO Auto-generated method stub
//		if(i == 0)
//			return 1;
//		return i*fact(i-1);
//	}

}
