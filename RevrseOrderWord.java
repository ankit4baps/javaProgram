package com.pkg.nextgen;

import java.util.Scanner;

public class RevrseOrderWord {

	public static void main(String[] args) {
		// Program for reverse the order of words
		
		String str[], revWord ="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		str = sc.nextLine().split(" ");
		
		//logic for reverse the order of words
		
		for(int i = str.length - 1; i >= 0; i--) {
			revWord = revWord + str[i] + " ";
		}
		System.out.println("Reverse Order Word is: " + revWord);
	}

}
