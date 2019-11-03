package DynamicProgramming;

public class uglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150;
		
		int[] ugly = new int[n];
		ugly[0] =1;
		int i2 =0, i3 = 0,i5 =0;
		int mul2 = ugly[i2]*2;
		int mul3 = ugly[i3]*3;
		int mul5 = ugly[i5]*5;
		
		for(int i=1; i<n;i++) {
			ugly[i] = Math.min(Math.min(mul2, mul3),mul5);
			if(ugly[i] == mul2) {
				i2 +=1;
				mul2 = ugly[i2]*2;
			}
			if(ugly[i] == mul3) {
				i3 +=1;
				mul3 = ugly[i3]*3;
			}
			if(ugly[i] == mul5) {
				i5 +=1;
				mul5 = ugly[i5]*5;
			}
		}
		System.out.println(ugly[n-1]);
		
	}

}
