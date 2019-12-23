package HackerRank4thBadge;

public class jumpingCloud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = {0, 0, 0, 1, 0,0 };
		
		int jump = 0;
		int i=0;
		
		while(i<c.length-2) {
			
			if(c[i] == 1) {
				i = i+2;
				jump++;
			}
			else {
			if(c[i+1] == 0 && c[i+2] == 0) {
				i = i+2;
				jump++;
			
			}else if(c[i+1] == 0 && c[i+2] == 1) {
				i = i+1;
				jump++;
			}else if (c[i+1] == 1 && c[i+2] == 0) {
				i = i+2;
				jump++;
			}
			
			}
			
			if(c.length - i -1 == 1 || c.length-i -1== 2) {
				jump++;
				break;
			}
		}
		
		System.out.println(jump);

	}

}
