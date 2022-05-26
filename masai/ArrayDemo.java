package com.masai;

public class ArrayDemo {
	public static void main(String[] args) {
		
		
		int[] marks;
		marks = new int[20];
	System.out.println(marks);
	System.out.println(marks.length);
	
	marks[5] = 90;
	System.out.println(marks[5]); // 90
	System.out.println(marks[1]); // 0 default value will be 0 and for boolean default value is false.
	
	
	int[] arr = {0,1,2,3,4};
	
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);
	}
	
	
	}
	
}
