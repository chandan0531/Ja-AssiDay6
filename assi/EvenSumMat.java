package com.assi;

public class EvenSumMat {
	public static void main(String[] args) {
		
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9},};
		
//		for(int c=0; c<mat[0].length; c++)
//		{
//			int total = 0;
//			for(int r=0; r<mat.length; r++ )
//			{
//				if(mat[r][c]%2==0)
//				{
//					total = total + mat[r][c];
////					System.out.println(mat[r][c]);
//					System.out.println(total);
//				}
//				
//			}
//		}
		
		
		int sum1 = 0;
		for(int r=0; r<mat.length; r++)
		{
			if(mat[r][0]%2==0)
			{
				sum1 = sum1 + mat[r][0];
			}
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(int r=0; r<mat.length; r++)
		{
			if(mat[r][1]%2==0)
			{
				sum2 = sum2 + mat[r][1];
			}
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int r=0; r<mat.length; r++)
		{
			if(mat[r][2]%2==0)
			{
				sum3 = sum3 + mat[r][2];
			}
		}
		System.out.println(sum3);
	}
}
