// print the array.

package com.masai;

public class WeProblem {
	
	public static void main(String[] args) {
		
		int[] marks = {10,20,30};
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
	// we problem
		//compare total and average.
		
		int[] age = {34,56,23,87,90,60};
		
		int total = 0;
		int average = 0; // or double
		
		for(int iteamArr : age)
		{
			total += iteamArr;
		}
		
		average = total/age.length;
		System.out.println(total + " " + average);
		
	}
}
