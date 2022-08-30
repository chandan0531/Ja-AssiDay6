package com.assi;

public class CommandLine {
	public static void main(String[] args) {
		
		if(args.length==1)
		{
			int n = Integer.parseInt(args[0]);
			int factorial = 1;
			for(int i=1; i<=n; i++)
			{
				factorial = factorial*i;
			}
			System.out.println(factorial);
		}
		else if(args.length==2)
		{
			int factorial2 = 1;
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int num = Math.abs(n1-n2);
			
			for(int j=1; j<= num; j++)
			{
				factorial2 = factorial2 *j;
			}
			System.out.println(factorial2);
		}
		else
		{
			System.out.println("Error");
		}
	}
}
