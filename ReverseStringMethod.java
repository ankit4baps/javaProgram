package com.pkg.nextgen;

import java.util.Scanner;

public class ReverseStringMethod {

	public static void main(String[] args) {
		// Program for access class method object in main method
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.nextLine();

		//create an object of class ReverseString
		ReverseString rs = new ReverseString();
		
		//call the method
		System.out.println(" Reverse String is:" + rs.revString(str));
	}

}
