package com.pkg.nextgen;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// Program for String Palindrome
		
		String str = "";
		String revStr = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		str = sc.nextLine();
		
		//logic for reverse the string
		
		for(int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		//if reverse String is equal to same string then is palindrom
		if(str.equals(revStr)) {
			System.out.println("String is Palindrom");
		}
		else {
			System.out.println("String is not Palindrom");
		}
			
		

	}

}
