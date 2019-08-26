package geeksForGeek;

public class SortedRotatedArraySumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =  {11, 15, 26, 38, 9, 10}; 
		int n = a.length;
		int sum = 35;
		
		int i =0;
		for(i =0; i<n-1; i++)
		{
			if(a[i] > a[i+1])
				break;
		}
		int l = (i+1)%n;
		int r = i;
		
		while(l!=r)
		{
			if(a[l]+a[r] == sum)
			{
				System.out.println("found pair are "+a[l]+" "+a[r]);
				break;
			}
			if(a[l]+a[r] <sum)
				l = (l+1)%n;
			else r = (r+n-1)%n;
		}

	}

}
