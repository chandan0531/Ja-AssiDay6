package com.masai;

public class MatrixArr {
	
	public static void main(String[] args) {
		
//		1st way
		int[][] m = new int[3][4];
//		replace the value
		m[1][1] = 17;
		
//		2nd way
		int[][] mat = {
				{1,2},
				{3,4,5},
			};
		
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<mat[r].length; c++)
			{
				System.out.println(mat[r][c]);
			}
		}
	}
}
