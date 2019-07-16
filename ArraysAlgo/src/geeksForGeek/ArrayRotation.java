package geeksForGeek;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6,7};
		int i=0 , j=0;
		int rotBy = 2;
		int n = a.length;
		System.out.println("Array before Rotation");
		for(int ele:a)
			System.out.print(ele+" ");
		while( j < rotBy)
		{
			int temp = a[j];
			for(i=1; i<n; i++)
			{
				a[i-1] = a[i];
			}
			a[i-1] = temp;
			j++;
		}
		System.out.println("Array after Rotation");
		for(int ele:a)
			System.out.print(ele+" ");
	}

}
