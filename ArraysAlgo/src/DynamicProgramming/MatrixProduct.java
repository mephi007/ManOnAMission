package DynamicProgramming;

public class MatrixProduct {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{-1,2,3},{4,5,6},{7,8,9}};
		System.out.println(matrixProduct(matrix));

	}

	private static int matrixProduct(int[][] matrix) {
		// TODO Auto-generated method stub
		if(matrix.length == 0 || matrix[0].length == 0)
			return 0;
		
		int[][] min = new int[matrix.length][matrix[0].length];
		int[][] max = new int[matrix.length][matrix[0].length];
		
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j<matrix[0].length; j++) {
				
				if(i == 0 && j == 0) {
					min[i][j] = matrix[i][j];
					max[i][j] = matrix[i][j];
					continue;
				}
				int maxValue = Integer.MIN_VALUE;
				int minValue = Integer.MAX_VALUE;
				
				if(i>0) {
					int tempMax = Math.max(matrix[i][j]*max[i-1][j] , matrix[i][j]*min[i-1][j]);
					maxValue = Math.max(tempMax, maxValue);
					int tempMin = Math.min(matrix[i][j]*max[i-1][j] , matrix[i][j]*min[i-1][j]);
					minValue = Math.min(tempMin, minValue);
				}
				if(j>0) {
					int tempMax = Math.max(matrix[i][j]*max[i][j-1] , matrix[i][j]*min[i][j-1]);
					maxValue = Math.max(tempMax, maxValue);
					int tempMin = Math.min(matrix[i][j]*max[i][j-1] , matrix[i][j]*min[i][j-1]);
					minValue = Math.min(tempMin, minValue);
				}
				
				min[i][j] = minValue;
				max[i][j] = maxValue;
			}
		}

	return max[matrix.length-1][matrix[0].length-1];
	
	}

}
