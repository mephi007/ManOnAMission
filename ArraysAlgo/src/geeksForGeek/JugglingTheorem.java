package geeksForGeek;

public class JugglingTheorem {
	
	public static int Gcd(int a, int b)
	{
		if(b == 0)
		{
			return a;
		}
		else {
			return Gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};
		int n = a.length;
		int k =3;
		
		int gcd = Gcd(n,k);
		System.out.println(gcd);
		int j=0,i=0;
		
		while(i < gcd)
		{
			int temp = a[i];
			j = i;
			int d = -1;
			System.out.println("value of i"+i);
			while(true)
			{
				
				d = (j+k)%n;
				if(d == i)
					break;
				a[j] = a[d];
				j = d;
			}
			a[j] = temp;
			
			i++;
	
		}
		
		for(int ele:a)
			System.out.print(ele + "- ");

	}

}
