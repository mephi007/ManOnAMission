package geeksForGeek;

public class RightShiftReversalAlgo {
	
	public static void ReversalAlgo(int[] a, int start, int end)
	{
		int s =start, e= end-1;
		
		while(s<e)
		{
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		int d =2;   //shift no of element
		int n = a.length;
		
		System.out.println("array before reversal");
		for(int ele: a)
			System.out.print(ele+" ");
		System.out.println("\n");
		System.out.println("-------------");
		
		//right shift
		//step1 take 1st part as start=0 to end=n-d and reverse 
		ReversalAlgo(a, 0, n-d);
		
		//step2 take 2nd part as start=n-d+1 to end = n and reverse
		ReversalAlgo(a, n-d, n);
		
		//step3 reverse whole array
		ReversalAlgo(a, 0, n);
		
		System.out.println("array after reversal");
		for(int ele: a)
			System.out.print(ele+" ");
		
		

	}

}
