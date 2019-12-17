package HackerRank4thBadge;

public class formingMagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] s = { { 4, 8, 2 },
                { 4, 5, 7 },
                { 6, 1, 6 }};
		
		
		 int[][][] d={
			    	{{8,1,6},{3,5,7},{4,9,2}},
				    {{6,1,8},{7,5,3},{2,9,4}},
				    {{4,9,2},{3,5,7},{8,1,6}},
				    {{2,9,4},{7,5,3},{6,1,8}},
				    {{8,3,4},{1,5,9},{6,7,2}},
				    {{4,3,8},{9,5,1},{2,7,6}},
				    {{6,7,2},{1,5,9},{8,3,4}},
				    {{2,7,6},{9,5,1},{4,3,8}}
				};
		 
		 int[] c = new int[8];
		 int min = Integer.MAX_VALUE;
		 
		 for(int k=0; k<8; k++) {
			 c[k]=0;
			 for(int i=0; i<3; i++) {
				 for(int j=0; j<3; j++) {
					 if(s[i][j] != d[k][i][j])
						 c[k] = Math.abs(s[i][j] - d[k][i][j]);
				 }
			 }
		 }
		 
		 for(int i=0; i<8; i++) {
			 if(c[i] < min)
				 min = c[i];
		 }
		 
		 System.out.println(min);
	}

}
