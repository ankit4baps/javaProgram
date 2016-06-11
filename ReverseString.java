package com.pkg.nextgen;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Program for Reverse the String
		
		String str, revStr = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		str = sc.nextLine();
		
		//Logic for reverse the string
		
		for(int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println("Reverse String is: " + revStr);
	}

}
