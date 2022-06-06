package com.assi;


import java.util.Scanner;

public class Main1 {
		
	public static String reversString(String input){
		
		char[] ch = input.toCharArray();
		String str = "";
		
		for (int i = ch.length-1; i >=0; i--) {
			str = str + ch[i];
		}
		return str;
		}
		public static void main(String[] args){
			
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		
		
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		}
}
