package geeksForGeek;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		
		System.out.println("array before reversal");
		for(int ele: a)
			System.out.print(ele+" ");
		System.out.println("\n");
		System.out.println("-------------");
		int s =0, e= a.length-1;
		
		while(s<e)
		{
			int temp = a[s];
			a[s] = a[e];
			a[e] = temp;
			s++;
			e--;
		}
		
		System.out.println("array after reversal");
		for(int ele: a)
			System.out.print(ele+" ");

	}

}
